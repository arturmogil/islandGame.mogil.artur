package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Predator {
    public Wolf(Location location) {
        super(location);
        this.weight = 50;
        this.maxCountPerCell = 30;
        this.speed = 3;
        this.requiredFood = 8.0;
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Rabbit.class, 60);
        dietMap.put(Mouse.class, 80);
        dietMap.put(Squirrel.class, 70);
        dietMap.put(Duck.class, 60);
        dietMap.put(Beaver.class, 15);
        dietMap.put(Bison.class, 10);
        dietMap.put(Buffalo.class, 10);
        dietMap.put(Camel.class, 5);
        dietMap.put(Deer.class, 80);
        dietMap.put(Goat.class, 40);
        dietMap.put(Sheep.class, 70);
        dietMap.put(Bear.class, 20);
        dietMap.put(Fox.class, 30);
        dietMap.put(Hyena.class, 10);
        dietMap.put(Owl.class, 70);
        dietMap.put(Panther.class, 40);
        dietMap.put(Skunk.class, 10);
    }
    @Override
    protected boolean canEat(Animal animal) {
        Integer chance = dietMap.get(animal.getClass());
        if (chance == null || chance == 0) return false;

        int roll = ThreadLocalRandom.current().nextInt(100);
        return roll < chance;
    }

    @Override
    public void move() {

    }

    @Override
    public Animal reproduce() {
        return new Wolf(currentLocation);
    }
}
