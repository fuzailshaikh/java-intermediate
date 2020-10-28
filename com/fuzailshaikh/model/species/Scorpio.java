package com.fuzailshaikh.model.species;

import com.fuzailshaikh.model.categories.Animal;
import com.fuzailshaikh.model.interfaces.HasLegs;

public class Scorpio extends Animal implements HasLegs {

	public Scorpio(String name) {
		super(name);
	}

	@Override
	public int legCount() {
		return 8;
	}

}
