package ua.lviv.iot.animalshop.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class AbstractAnimal {

	protected String name;

	protected int ageInMonths;

	protected String color;

	@Autowired
	protected Sex sex;

	protected BiologicalClass biologicalClass;

	protected double heightInMeters;

	protected double lengthInMeters;

	protected double foodPerDayInKg;

	protected String foodType;

	protected double priceInUAH;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public AbstractAnimal(int ageInMonths) {
		super();
		this.ageInMonths = ageInMonths;
	}	

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
	}

	public BiologicalClass getAnimal() {
		return biologicalClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public BiologicalClass getBiologicalClass() {
		return biologicalClass;
	}

	public void setBiologicalClass(BiologicalClass biologicalClass) {
		this.biologicalClass = biologicalClass;
	}

	public double getHeightInMeters() {
		return heightInMeters;
	}

	public void setHeightInMeters(double heightInMeters) {
		this.heightInMeters = heightInMeters;
	}

	public double getLengthInMeters() {
		return lengthInMeters;
	}

	public void setLengthInMeters(double lengthInMeters) {
		this.lengthInMeters = lengthInMeters;
	}

	public double getFoodPerDayInKg() {
		return foodPerDayInKg;
	}

	public void setFoodPerDayInKg(double foodPerDayInKg) {
		this.foodPerDayInKg = foodPerDayInKg;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public void setPriceInUAH(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}
	
	 public String getHeaders() {
		 return "name" + "," + "price in hryvnia" + "," + "age";
		 }
	 
	 public String toCSV() {
		 return getName() + "," + getPriceInUAH() + "," + getAgeInMonths();
		 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AbstractAnimal() {
	}
}
