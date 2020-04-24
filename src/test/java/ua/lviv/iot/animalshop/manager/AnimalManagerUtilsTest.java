package ua.lviv.iot.animalshop.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.animalshop.rest.model.SortType;

public class AnimalManagerUtilsTest extends BaseAnimalManagerTest {
 
	@Test
	public void testSortingByAge() {
		AnimalManagerUtils.sortByAge(animals, SortType.DESC);
		assertEquals(36, animals.get(0).getAgeInMonths());
		assertEquals(24, animals.get(1).getAgeInMonths());
		assertEquals(12, animals.get(2).getAgeInMonths());
	}
	
	@Test
	public void testSortingByPriceInUAH() {
		AnimalManagerUtils.sortByPriceInUAH(animals, SortType.DESC);
		assertEquals(150, animals.get(0).getPriceInUAH());
		assertEquals(250, animals.get(1).getPriceInUAH());
		assertEquals(400, animals.get(2).getPriceInUAH());

	}
	
	@Test
	public void testSortingByFoodAmountPerDay() {
		AnimalManagerUtils.sortByFoodAmountPerDay(animals, SortType.DESC);
		assertEquals(5, animals.get(0).getFoodPerDayInKg());
		assertEquals(7, animals.get(1).getFoodPerDayInKg());
		assertEquals(4, animals.get(2).getFoodPerDayInKg());
	}
	
	
	
} 
