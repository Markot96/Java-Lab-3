package ua.lviv.iot.animalshop.writer;

import ua.lviv.iot.animalshop.manager.AnimalManagerTest;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.jupiter.api.Test;

public class AnimalShopWriterTest extends AnimalManagerTest {
	AnimalShopWriter animalsWriter = new AnimalShopWriter();

	@Test
	void writingAFileTest() throws IOException {

		try (Writer csvWriter = new FileWriter("LawyersWriter.csv")) {
			animalsWriter.setCsvWriter(csvWriter);
			animalsWriter.writeToFile(animals);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
