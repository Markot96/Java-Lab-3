package ua.lviv.iot.animalshop.model;

public class Fish extends AbstractAnimal {

	protected int caviarCountPerSeason;

	public Fish(int ageInMonths) {
		super(ageInMonths);
		this.biologicalClass = BiologicalClass.FISH;

	}

	public int getCaviarCountPerSeason() {
		return caviarCountPerSeason;
	}

	public void setCaviarCountPerSeason(int caviarCountPerSeason) {
		this.caviarCountPerSeason = caviarCountPerSeason;
	}

}
