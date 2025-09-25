package Pets.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Pets.demo.entity.Pets;

@Repository
public interface PetRepository extends JpaRepository<Pets, Integer> {
	
}
