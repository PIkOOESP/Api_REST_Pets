package Pets.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String category;
    private String chip;
    private LocalDate born;
    private boolean adopt;

    public Pets() {
    }

    public Pets(String name, String category, String chip, LocalDate born) {
        this.name = name;
        this.category = category;
        this.chip = chip;
        this.born = born;
        this.adopt = false;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getChip() {
        return chip;
    }
    public void setChip(String chip) {
        this.chip = chip;
    }
    public LocalDate getBorn() {
        return born;
    }
    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public boolean getAdopt(){
        return adopt;
    }

    public void setAdopt(boolean adopt){
        this.adopt = adopt;
    }
}