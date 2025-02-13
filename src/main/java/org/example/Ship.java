package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ship {
    private String name;
    @Autowired
    private Pirate pirate;

    public Ship() {}
    public Ship(String name, Pirate pirate) {
        this.name = name;
        this.pirate = pirate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pirate getPirate() {
        return pirate;
    }

    public void setPirate(Pirate pirate) {
        this.pirate = pirate;
    }
}
