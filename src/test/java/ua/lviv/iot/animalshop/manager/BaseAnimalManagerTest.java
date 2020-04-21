package ua.lviv.iot.animalshop.manager;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.animalshop.rest.model.AbstractAnimal;
import ua.lviv.iot.animalshop.rest.model.Bird;
import ua.lviv.iot.animalshop.rest.model.Fish;
import ua.lviv.iot.animalshop.rest.model.Mammal;

public abstract class BaseAnimalManagerTest {
	
	protected LinkedList<AbstractAnimal> animals;
	
	
	
	@BeforeEach
	public void createAnimals() {
		animals = new LinkedList<AbstractAnimal>();
		animals.add(new Bird(24));
		animals.add(new Bird(36));
		animals.add(new Bird(12));
		
		animals.add(new Fish(8));
		animals.add(new Fish(9));
		animals.add(new Fish(7));
		
		animals.add(new Mammal(120));
		animals.add(new Mammal(136));
		animals.add(new Mammal(108));
	}

	
}
