package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.*;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Skunk extends Predator {
    public Skunk(Location location) {
        super(location);
        this.weight = 5;
        this.maxCountPerCell = 5;
        this.speed = 2;
        this.requiredFood = 2.0;
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();
    static {
        dietMap.put(Mouse.class, 70);
        dietMap.put(Rabbit.class, 50);
        dietMap.put(Squirrel.class, 40);
        dietMap.put(Duck.class, 20);
        dietMap.put(Beaver.class, 10);
        dietMap.put(Caterpillar.class, 90);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }

}
