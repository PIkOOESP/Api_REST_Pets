package Pets.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import Pets.demo.entity.Pets;
import Pets.demo.repository.PetRepository;
/**
 * <p>En este controlador se exponen todos los endpoints relacionados con pets. {@link PetRepository}</p>
 * @version 1.0
 * @author Miguel Angel Santiago
 */


@RestController
@RequestMapping("/pets")
public class PetController {

    private PetRepository petRepository;

    
    @PostMapping
    public void adopt(int id) {
        Pets pet = petRepository.findById(id).orElseThrow();
        pet.setAdopt(true);
        petRepository.save(pet);
    }
    

    /**
     * <p>Constructor del controlador de mascotas.</p>
     * @param petRepository repositorio para consultar la base de datos.
     */

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    /**
     * <p>Este metodo devuelve una lista con todas las mascotas en la base de datos.</p>
     * @return List<Pets> informacion de todas las mascotas en la base de datos.
     */

    @GetMapping("/list")
    public List<Pets> hello() {
        return petRepository.findAll();
    }
}
