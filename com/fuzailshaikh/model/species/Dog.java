package com.fuzailshaikh.model.species;

import com.fuzailshaikh.model.categories.Mammal;
import com.fuzailshaikh.model.interfaces.HasLegs;
import com.fuzailshaikh.model.interfaces.MakesSound;

public class Dog extends Mammal implements HasLegs, MakesSound {

	public Dog(String name) {
		super(name);
	}

	@Override
	public int legCount() {
		return 4;
	}

	@Override
	public String sound() {
		return "bark";
	}

}
