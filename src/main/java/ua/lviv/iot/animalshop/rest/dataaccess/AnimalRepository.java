package ua.lviv.iot.animalshop.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.animalshop.rest.model.AbstractAnimal;

@Repository
public interface AnimalRepository extends JpaRepository<AbstractAnimal, Integer> {

}
