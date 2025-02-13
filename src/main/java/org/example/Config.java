package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {
    @Bean
    public Pirate Luffy() {
        Pirate pirate = new Pirate();
        pirate.setName("Luffy");
        return pirate;
    }
    @Bean
    @Primary
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
    public Pirate Law() {
        Pirate pirate = new Pirate();
        pirate.setName("Law");
        return pirate;
    }
}
