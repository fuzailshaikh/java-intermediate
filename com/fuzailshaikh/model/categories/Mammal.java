package com.fuzailshaikh.model.categories;

import com.fuzailshaikh.model.interfaces.Vertebrate;

public abstract class Mammal extends Animal implements Vertebrate {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public boolean isWarmBlooded() {
        return true;
    }
    
}
