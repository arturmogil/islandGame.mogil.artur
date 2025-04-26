package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.*;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Anaconda extends Predator {
    public Anaconda(Location location) {
        super(location);
        this.weight = 10;
        this.maxCountPerCell = 10;
        this.speed = 2;
        this.requiredFood = 3.0;
    }

    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Mouse.class, 40);
        dietMap.put(Rabbit.class, 50);
        dietMap.put(Duck.class, 40);
        dietMap.put(Goat.class, 10);
        dietMap.put(Sheep.class, 10);
        dietMap.put(WildBoar.class, 20);
        dietMap.put(Beaver.class, 10);
        dietMap.put(Bison.class, 5);
        dietMap.put(Buffalo.class, 5);
        dietMap.put(Squirrel.class, 20);
        dietMap.put(Boa.class, 30);
        dietMap.put(Fox.class, 5);
        dietMap.put(Hyena.class, 5);
        dietMap.put(Panther.class, 5);
        dietMap.put(Skunk.class, 5);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }

}
