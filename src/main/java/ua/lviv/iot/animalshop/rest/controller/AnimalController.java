package ua.lviv.iot.animalshop.rest.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.animalshop.rest.model.AbstractAnimal;

@RequestMapping("/animals")
@RestController
public class AnimalController {

	private Map<Integer, AbstractAnimal> animals = new HashMap<>();
	private AtomicInteger IdCounter = new AtomicInteger();

	@GetMapping
	public List<AbstractAnimal> getAllAnimals() {
		return new LinkedList<>(animals.values());
	}

	@GetMapping(path = "/{id}")
	public AbstractAnimal getAnimal(final @PathVariable("id") Integer animalId) {
		return animals.get(animalId);
	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public AbstractAnimal createAnimal(final @RequestBody AbstractAnimal animal) {
		animal.setId(IdCounter.incrementAndGet());
		animals.put(animal.getId(), animal);
		return animal;
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<AbstractAnimal> deleteAnimal(@PathVariable("id") Integer animalId) {
		HttpStatus status = animals.remove(animalId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
		return ResponseEntity.status(status).build();
	}
	
	
	
	@PutMapping(path = "/{id}")
    public ResponseEntity<AbstractAnimal> updateAnimal(final @PathVariable("id") Integer animalId,
            final @RequestBody AbstractAnimal animal) {
        HttpStatus status;
        animal.setId(animalId);
        if (animals.containsKey(animalId)) {
            animals.put(animalId, animal);
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<AbstractAnimal>(animal, status);
    }

}


//return ResponseEntity.status(status).build();
