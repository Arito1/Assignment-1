package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {
    @Bean
    @Primary
    public Pirate pirateLuffy() {
        Pirate pirate = new Pirate();
        pirate.setName("Luffy");
        return pirate;
    }
    @Bean
    public Pirate pirate() {
        Pirate pirate = new Pirate();
        pirate.setName("pirate");
        return pirate;
    }
    @Bean
    public Pirate Zoro() {
        Pirate pirate = new Pirate();
        pirate.setName("Zoro");
        return pirate;
    }
    @Bean
    public Pirate Sanji() {
        Pirate pirate = new Pirate();
        pirate.setName("Sanji");
        return pirate;
    }
    @Bean
    public Pirate Law() {
        Pirate pirate = new Pirate();
        pirate.setName("Law");
        return pirate;
    }
}
