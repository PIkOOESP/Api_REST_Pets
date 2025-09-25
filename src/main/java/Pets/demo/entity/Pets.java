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

    private String Name;
    private String Category;
    private String Chip;
    private LocalDate born;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public String getChip() {
        return Chip;
    }
    public void setChip(String chip) {
        Chip = chip;
    }
    public LocalDate getBorn() {
        return born;
    }
    public void setBorn(LocalDate born) {
        this.born = born;
    }
}