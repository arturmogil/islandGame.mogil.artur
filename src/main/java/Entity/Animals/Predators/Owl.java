package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.*;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Owl extends Predator {
    public Owl(Location location) {
        super(location);
        this.weight = 15;
        this.maxCountPerCell = 10;
        this.speed = 4;
        this.requiredFood = 2;
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();
    static {
        dietMap.put(Mouse.class, 95);
        dietMap.put(Rabbit.class, 90);
        dietMap.put(Squirrel.class, 90);
        dietMap.put(Duck.class, 80);
        dietMap.put(Beaver.class, 5);
        dietMap.put(Skunk.class, 5);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }

}
