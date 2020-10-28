package com.fuzailshaikh.model.categories;

import com.fuzailshaikh.model.interfaces.Vertebrate;

public abstract class Bird extends Animal implements Vertebrate {

	public Bird(String name) {
		super(name);
	}

	@Override
	public boolean isWarmBlooded() {
		return false;
	}

}
