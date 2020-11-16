package com.fuzailshaikh;

import java.util.List;

import com.fuzailshaikh.exceptions.InsufficientCapacityException;
import com.fuzailshaikh.model.categories.Animal;
import com.fuzailshaikh.model.enums.CleanSchedule;
import com.fuzailshaikh.model.interfaces.MakesSound;
import com.fuzailshaikh.model.species.Crow;
import com.fuzailshaikh.model.species.Dog;
import com.fuzailshaikh.model.species.Scorpio;

public class Zoo {
	public static void main(String[] args) {
		Cage shed = Cage.Builder.newInstance().setCapacity(3).setCleanSchedule(CleanSchedule.WEEKLY).build();
		Cage smallBox = Cage.Builder.newInstance().setCapacity(1).setCleanSchedule(CleanSchedule.DAILY).build();

		Dog bruno = new Dog("Bruno");
		Dog snow = new Dog("Snowflake");
		Crow danny = new Crow("Danny D");
		Scorpio hanks = new Scorpio("Hanks");

		Animal[] allAnimals = { hanks, bruno, snow, danny };

		for (Animal animal : allAnimals) {
			if (animal instanceof MakesSound) {
				MakesSound audibleAnimal = (MakesSound) animal;
				System.out.println(animal.name + " makes sound of " + audibleAnimal.sound());
			}
		}

		try {
			Dog[] myDogs = { bruno, snow };
			shed.addAnimal(myDogs);
			System.out.println("My dogs are safe in shed :D");
		} catch (InsufficientCapacityException e) {
			e.printStackTrace();
			System.err.println("There wasn't enough space for my cute dogs :(");
		}

		try {
			smallBox.addAnimal(hanks);
			System.out.println("Hanks got a home");
		} catch (InsufficientCapacityException e) {
			System.err.println("We don't have place for scorpios here anymore");
		}

		Vet mark = new Vet();
		mark.vaccinateAnimalsFromCage(List.of(shed, smallBox));
	}

}
