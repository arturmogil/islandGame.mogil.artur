package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Environment.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predator extends Animal {
    public Predator(Location location) {
        this.currentLocation = location;
        location.addAnimal(this);
    }

    protected abstract Map<Class<? extends Animal>, Integer> getDietMap();

    protected boolean canEat(Animal animal) {
        Integer chance = getDietMap().get(animal.getClass());
        if (chance == null || chance == 0) return false;

        int roll = ThreadLocalRandom.current().nextInt(100);
        return roll < chance;
    }

    @Override
    public void eat() {
        if (currentFood >= requiredFood) {
            hungryDays = 0;
            return;
        }
        List<Animal> animals = new ArrayList<>(currentLocation.getAnimals());
        for (Animal other : animals) {
            if (other != this && canEat(other)) {
                double foodGained = Math.min(requiredFood - currentFood, other.getWeight());
                currentFood += foodGained;
                currentLocation.removeAnimal(other);
                //Логування для перевірки
                //System.out.println(this + " ate " + other + " and gained " + foodGained + " food. Gained food " + currentFood);
                if (currentFood >= requiredFood) break;
            }
        }
        if (currentFood < requiredFood) {
            hungryDays++;
        } else {
            hungryDays = 0;
        }
    }
}

