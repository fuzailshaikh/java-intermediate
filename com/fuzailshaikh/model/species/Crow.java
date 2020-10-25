package com.fuzailshaikh.model.species;

import com.fuzailshaikh.model.categories.Bird;
import com.fuzailshaikh.model.interfaces.HasLegs;
import com.fuzailshaikh.model.interfaces.MakesSound;

public class Crow extends Bird implements HasLegs, MakesSound {

    public Crow(String name) {
        super(name);
    }

    @Override
    public int legCount() {
        return 2;
    }

    @Override
    public String sound() {
        return "Caw";
    }
    
}
