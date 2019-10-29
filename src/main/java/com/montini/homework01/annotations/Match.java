package com.montini.homework01.annotations;

import com.montini.homework01.xml.model.Football;
import com.montini.homework01.xml.model.Footballer;
import com.montini.homework01.xml.model.NationalTeamPlayer;
import com.montini.homework01.xml.model.NationalTeamTShirt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class Match {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("homework01-annotations-beans.xml");

        Footballer johny = context.getBean("footballer", Footballer.class);

        johny.run(75);
        johny.jump(30);
        johny.score();

        System.out.printf("\n\n");

        NationalTeamPlayer goetze = context.getBean("nationalTeamPlayer", NationalTeamPlayer.class);
        goetze.setName("Mario Götze");

        NationalTeamTShirt tShirt = context.getBean("nationalTeamTShirt", NationalTeamTShirt.class);
        // TODO: set tShirt to "Bayern München"
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
