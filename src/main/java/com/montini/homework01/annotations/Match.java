package com.montini.homework01.annotations;

import com.montini.homework01.annotations.model.Football;
import com.montini.homework01.annotations.model.Footballer;
import com.montini.homework01.annotations.model.NationalTeamPlayer;
import com.montini.homework01.annotations.model.NationalTeamTShirt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Match {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("homework01-annotations-beans.xml");

        Footballer johnny = context.getBean("johnny", Footballer.class);

        johnny.run(75);
        johnny.jump(30);
        johnny.score();

        System.out.printf("\n\n");

        NationalTeamPlayer goetze = context.getBean("goetze", NationalTeamPlayer.class);
        // goetze.setName("Mario Götze");

        NationalTeamTShirt tShirt = context.getBean("bayern", NationalTeamTShirt.class);
        System.out.println(goetze.wears(tShirt));
        tShirt.displays();

        // Add to the "collection" of players - a team
        final Set<Footballer> team = new HashSet<Footballer>(10);
        team.add(goetze);

        System.out.println(team.stream().findFirst().get());

        goetze.run(50);

        // "Default" Götze shoot: shoots like a Sportsman
        goetze.shoot(new Football());

        //
        goetze.shoot(new Football() {
            @Override
            public long move(long meters) {
                System.out.println("Out!");
                // Note, we do change the defaulted print "Ball moves" for now
                return 0;
            }
        });

        // Runs like a MovingMan
        goetze.run(10);

        // Scores like a Footballer
        goetze.score(3);

        // Jumps as a MovingMan
        goetze.jump(56);
        goetze.run(120);

        // Scores as a Sportsman
        goetze.score(2);

    }
}
