package Pets.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pets.demo.entity.Pets;
import Pets.demo.repository.PetRepository;
/**
 * <p>En este controlador se exponen todos los endpoints relacionados con pets. {@link PetRepository}</p>
 * @version 1.0
 * @author Miguel Angel Santiago
 */
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/pets")
public class PetController {

    private PetRepository petRepository;

    /**
     * <p>El metodo se usa para guardar al pet adoptado</p>
     * @param id
     * @return
     */

    @PostMapping("/adopt/{id}")
    public Pets adopt(@PathVariable int id) {
        Pets pet= petRepository.findById(id).get();
        pet.setAdopt(true);
        return petRepository.save(pet);
    }

    /**
     * <p>El metodo se usa para guardar al pet no adoptado</p>
     * @param id
     * @return
     */

    @PostMapping("/desadopt/{id}")
    public Pets desadopt(@PathVariable int id) {
        Pets pet= petRepository.findById(id).get();
        pet.setAdopt(false);
        return petRepository.save(pet);
    }

    /**
     * <p>El metodo se usa para crear una nueva mascota</p>
     * @param name
     * @param chip
     * @param category
     * @param born
     * @return
     */
    
    @PostMapping("/nuevo")
    public Pets maspets(String name, String chip, String category, LocalDate born ){
        Pets pet = new Pets(name, category, chip, born);
        return petRepository.save(pet);
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
     * @return Lista de @link(Pets) informacion de todas las mascotas en la base de datos.
     */

    @GetMapping("/list")
    public List<Pets> hello() {
        return petRepository.findAll();
    }
}