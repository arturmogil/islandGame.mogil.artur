package Entity;

import Environment.Location;

import java.util.List;

public abstract class Predator extends Animal {
    public Predator(Location location) {
        this.currentLocation = location;
        location.addAnimal(this);
    }
    protected abstract boolean canEat(Animal animal);
    @Override
    public void eat() {
        List<Animal> animals = currentLocation.getAnimals();
        for (Animal other : animals) {
            if (other != this && canEat(other)) {
                double foodGained = other.getWeight(); // або можна обмежити
                this.currentFood += foodGained;
                other.die();
                System.out.println(this + " ate " + other);
                break;
            }
        }
    }
}
