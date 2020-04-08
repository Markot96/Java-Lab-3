package ua.lviv.iot.animalshop.writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.animalshop.model.AbstractAnimal;

public class AnimalShopWriter {

	public Writer csvWriter = new StringWriter();

	public Writer getCsvWriter() {
		return csvWriter;
	}

	public void setCsvWriter(Writer csvWriter) {
		this.csvWriter = csvWriter;
	}

	@Override
	public String toString() {
		return csvWriter.toString();
	}

	public void writeToFile(List<AbstractAnimal> animals) throws IOException {
		csvWriter.write(animals.get(0).getHeaders());
		csvWriter.write("\n");
		for (AbstractAnimal animal : animals) {
			csvWriter.write(animal.toCSV());
			csvWriter.write("\n");
		}
		csvWriter.flush();
	}
}