package ua.lviv.iot.animalshop.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.animalshop.model.AbstractAnimal;
import ua.lviv.iot.animalshop.model.BiologicalClass;

public class AnimalManager {

	private List<AbstractAnimal> animals = new LinkedList<>();

	public AnimalManager(List<AbstractAnimal> animals) {
		this.animals = animals;

	}

	public void addAnimals(List<AbstractAnimal> animals) {
		this.animals.addAll(animals);
	}

	public void addAnimal(AbstractAnimal animal) {
		this.animals.add(animal);
	}

	public List<AbstractAnimal> findAnimalByClass(BiologicalClass classToSearch, List<AbstractAnimal> animals) {
		List<AbstractAnimal> foundAnimal = new LinkedList<>();

		for (AbstractAnimal animal : animals) {

			if (animal.getAnimal() == classToSearch) {
				foundAnimal.add(animal);

			}
		}

		return foundAnimal;
	}

	public List<AbstractAnimal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<AbstractAnimal> animals) {
		this.animals = animals;
	}

}
