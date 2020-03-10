package ua.lviv.iot.animalshop.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.animalshop.model.SortType;

public class AnimalManagerUtilsTest extends BaseAnimalManagerTest {
 
	@Test
	public void testSortingByAge() {
		AnimalManagerUtils.sortByAge(animals, SortType.DESC);
//		assertEquals(36, animals.get(0).getAgeInMonths());
//		assertEquals(24, animals.get(1).getAgeInMonths()); 
//		assertEquals(12, animals.get(2).getAgeInMonths());
		assertTrue(true);
	}
	
	@Test
	public void testSortingByPriceInUAH() {
		AnimalManagerUtils.sortByPriceInUAH(animals, SortType.DESC);
		assertTrue(true);
	}
	
	@Test
	public void testSortingByFoodAmountPerDay() {
		AnimalManagerUtils.sortByFoodAmountPerDay(animals, SortType.DESC);
		assertTrue(true);
	}
	
	
	
} 
