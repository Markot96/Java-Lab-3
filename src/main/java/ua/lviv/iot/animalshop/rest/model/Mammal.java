package ua.lviv.iot.animalshop.rest.model;

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
	
	public String getHeaders() {
		return super.getHeaders() + "," + "fur length in meters";
	}

	public String toCSV() {
		return super.toCSV() + "," + getFurLengthInMeters();
	}

}
