package com.fuzailshaikh;

import java.util.List;
import java.util.stream.Collectors;

import com.fuzailshaikh.model.categories.Animal;

public class Vet {

	public void vaccinateAnimalsFromCage(List<Cage> cages) {
		cages.stream().map(this::getAnimalsFromCage)
									.map(this::vaccinateAnimals)
									.flatMap(x -> x.stream())
									.forEach(System.out::println);
	}

	public List<Animal> getAnimalsFromCage(Cage cage) {
		return cage.getAnimals();
	}

	public List<String> vaccinateAnimals(List<Animal> animals) {
		return animals.stream().map(animal -> "Vaccinated " + animal.name).collect(Collectors.toList());
	}

}
