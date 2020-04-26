package ua.lviv.iot.animalshop.rest.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.animalshop.rest.dataaccess.AnimalRepository;
import ua.lviv.iot.animalshop.rest.model.AbstractAnimal;

@Service
public class AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;
	
	public AbstractAnimal createAnimal(AbstractAnimal animal) {
		return animalRepository.save(animal);
	}
	
	public void deleteAnimal(Integer id) {
		animalRepository.deleteById(id);
	}
	
	public boolean animalExistsCheck(Integer id) {
		return animalRepository.existsById(id);
	}
	
	public AbstractAnimal updateAnimal(Integer id, AbstractAnimal newAnimal) {
		AbstractAnimal animal = animalRepository.getOne(id);
		animal = newAnimal;
		return animalRepository.save(animal);
	}
	
	public List<AbstractAnimal> findAll() {
		return animalRepository.findAll();
	}

}