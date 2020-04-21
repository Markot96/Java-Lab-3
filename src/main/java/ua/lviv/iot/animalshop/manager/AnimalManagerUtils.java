package ua.lviv.iot.animalshop.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.animalshop.rest.model.AbstractAnimal;
import ua.lviv.iot.animalshop.rest.model.SortType;

public class AnimalManagerUtils {

	private static final AnimalsSorterByAge ANIMALS_SORTER_BY_AGE = new AnimalsSorterByAge();

	// static inner class
	public static void sortByAge(List<AbstractAnimal> animals, SortType sortType) {
		animals.sort(sortType == SortType.ASC ? ANIMALS_SORTER_BY_AGE : ANIMALS_SORTER_BY_AGE.reversed());
	}
	
	// static inner class
	 public static void sortByPriceInUAH(List<AbstractAnimal> animals, SortType sortType) {
	        Comparator<AbstractAnimal> comparator = Comparator.comparing(AbstractAnimal::getPriceInUAH);
	        animals.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
	    }
	
	// anonymous inner class
	    public static void sortByFoodAmountPerDay(List<AbstractAnimal> animals, SortType sortType) {
	        Comparator<AbstractAnimal> comparator = new Comparator<AbstractAnimal>() {

	            @Override
	            public int compare(AbstractAnimal firstAnimal, AbstractAnimal secondAnimal) {
	                double foodPerDayInKgResult = firstAnimal.getFoodPerDayInKg() - secondAnimal.getFoodPerDayInKg();
	                if (foodPerDayInKgResult != 0) {
	                    return (int) foodPerDayInKgResult;
	                }
	                return Double.compare(firstAnimal.getFoodPerDayInKg(), secondAnimal.getFoodPerDayInKg());
	            }
	        };
	        animals.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
	    }
	


	static class AnimalsSorterByAge implements Comparator<AbstractAnimal>, Serializable {

		private static final long serialVersionUID = 1L;

		@Override
		public int compare(AbstractAnimal firstAnimal, AbstractAnimal secondAnimal) {
			return firstAnimal.getAgeInMonths() - secondAnimal.getAgeInMonths();
		}
	}

}
