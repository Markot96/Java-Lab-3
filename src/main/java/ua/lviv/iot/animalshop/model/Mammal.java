package ua.lviv.iot.animalshop.model;

public class Mammal extends AbstractAnimal {

	protected double furLengthInMeters;

	public Mammal(int ageInMonths) {
		super(ageInMonths);
		this.biologicalClass = BiologicalClass.MAMMAL;

	}

	public double getFurLengthInMeters() {
		return furLengthInMeters;
	}

	public void setFurLengthInMeters(double furLengthInMeters) {
		this.furLengthInMeters = furLengthInMeters;
	}

}
