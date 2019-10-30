package com.montini.homework01.java;

import com.montini.homework01.java.model.Footballer;
import com.montini.homework01.java.model.NationalTeamPlayer;
import com.montini.homework01.java.model.NationalTeamTShirt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.montini.homework01.java"})
public class AppConfig {

    @Bean
    public Footballer footballer(){
        return new Footballer();
    }

    @Bean
    public NationalTeamPlayer nationalTeamPlayer(){
        return new NationalTeamPlayer("noname");
    }

    @Bean
    public NationalTeamTShirt nationalTeamTShirt(){
        return new NationalTeamTShirt("nologo");
    }

}
