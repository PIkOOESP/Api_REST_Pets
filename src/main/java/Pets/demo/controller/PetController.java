package Pets.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Pets.demo.entity.Pets;
import Pets.demo.repository.PetRepository;

@RestController
public class PetController {

    private PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    @GetMapping
    public List<Pets> hello() {
        return petRepository.findAll();
    }
}
