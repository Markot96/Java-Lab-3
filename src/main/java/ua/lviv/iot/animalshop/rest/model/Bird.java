package ua.lviv.iot.animalshop.rest.model;

public class Bird extends AbstractAnimal {

	protected double wingSpanInMeters;

	protected String nestForm;

	public Bird(int ageInMonths) {
		super(ageInMonths);
		this.biologicalClass = BiologicalClass.BIRD;
	}

	public double getWingSpanInMeters() {
		return wingSpanInMeters;
	}

	public void setWingSpanInMeters(double wingSpanInMeters) {
		this.wingSpanInMeters = wingSpanInMeters;
	}

	public String getNestForm() {
		return nestForm;
	}

	public void setNestForm(String nestForm) {
		this.nestForm = nestForm;
	}

	public String getHeaders() {
		return super.getHeaders() + "," + "wing span in meters" + "," + "nest form";
	}

	public String toCSV() {
		return super.toCSV() + "," + getWingSpanInMeters() + "," + getNestForm();
	}

}
