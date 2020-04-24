package ua.lviv.iot.animalshop.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.animalshop.manager.AnimalManager;
import ua.lviv.iot.animalshop.rest.model.AbstractAnimal;
import ua.lviv.iot.animalshop.rest.model.BiologicalClass;


public class AnimalManagerTest extends BaseAnimalManagerTest {
	AnimalManager animalManager;
	

	@BeforeEach
	public void setUp() {
		animalManager = new AnimalManager(animals);
	}
	
	@Test
	public void testFindAnimalByClass() {
		List<AbstractAnimal> result = animalManager.findAnimalByClass(BiologicalClass.BIRD, animals);
		
		assertEquals(24, result.get(0).getAgeInMonths());
		assertEquals(36, result.get(1).getAgeInMonths());
		assertEquals(12, result.get(2).getAgeInMonths());
		
	}
}
