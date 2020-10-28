package com.fuzailshaikh;

import java.util.ArrayList;
import java.util.List;

import com.fuzailshaikh.exceptions.InsufficientCapacityException;
import com.fuzailshaikh.model.categories.Animal;
import com.fuzailshaikh.model.enums.CleanSchedule;

public class Cage {
	private List<Animal> animals;
	private int capacity;
	protected CleanSchedule cleanSchedule;

	public Cage(Builder builder) {
		animals = new ArrayList<>();
	}

	public void addAnimal(Animal a) throws InsufficientCapacityException {
		if (animals.size() < capacity) {
			animals.add(a);
		} else {
			throw new InsufficientCapacityException("Was trying to add " + a.name, capacity);
		}
	}

	public void addAnimal(Animal[] animals) throws InsufficientCapacityException {
		for (Animal animal : animals) {
			addAnimal(animal);
		}
	}

	public static class Builder {
		private int capacity;
		private CleanSchedule cleanSchedule;

		public static Builder newInstance() {
			return new Builder();
		}

		private Builder() {
		}

		public Builder setCapacity(int capacity) {
			this.capacity = capacity;
			return this;
		}

		public Builder setCleanSchedule(CleanSchedule cleanSchedule) {
			this.cleanSchedule = cleanSchedule;
			return this;
		}

		public Cage build() {
			return new Cage(this);
		}
	}
}
