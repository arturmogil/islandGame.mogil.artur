package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.*;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Predator {
    public Fox(Location location) {
        super(location);
        this.weight = 8;
        this.maxCountPerCell = 30;
        this.speed = 2;
        this.requiredFood = 2.0;
    }

    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Mouse.class, 90);
        dietMap.put(Rabbit.class, 70);
        dietMap.put(Squirrel.class, 60);
        dietMap.put(Duck.class, 80);
        dietMap.put(Caterpillar.class, 100);
        dietMap.put(Beaver.class, 40);
        dietMap.put(Sheep.class, 60);
        dietMap.put(Goat.class, 50);
        dietMap.put(Boa.class, 20);
        dietMap.put(Eagle.class, 5);
        dietMap.put(Hyena.class, 15);
        dietMap.put(Owl.class, 10);
        dietMap.put(Skunk.class, 30);
        dietMap.put(Wolf.class, 10);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }


}
