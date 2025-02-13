package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Pirate pirate = context.getBean(Pirate.class);
        Pirate pirate2 = context.getBean("Law", Pirate.class);
        System.out.println(pirate.getName()+" "+pirate2.getName());
    }
}