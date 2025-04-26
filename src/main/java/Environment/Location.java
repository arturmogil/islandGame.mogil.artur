package Environment;


import Entity.Animals.Animal;
import Entity.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private final List<Animal> animals = new ArrayList<>();
    private final List<Plant> plants = new ArrayList<>();
    private final int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    private Plant grass;

    public void setGrass(Plant grass) {
        this.grass = grass;
    }

    public Plant getGrass() {
        return grass;
    }
}
