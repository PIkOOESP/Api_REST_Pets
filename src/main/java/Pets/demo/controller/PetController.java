package Pets.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pets.demo.entity.Pets;
import Pets.demo.repository.PetRepository;

@RestController
@RequestMapping("/pets")
public class PetController {

    private PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    @GetMapping("/list")
    public List<Pets> hello() {
        return petRepository.findAll();
    }
}
