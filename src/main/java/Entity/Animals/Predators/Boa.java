package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.*;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Boa extends Predator {
    public Boa(Location location) {
        super(location);
        this.weight = 5;
        this.maxCountPerCell = 5;
        this.speed = 2;
        this.requiredFood = 2.0;
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();
    static {
        dietMap.put(Rabbit.class, 20);
        dietMap.put(Mouse.class, 40);
        dietMap.put(Duck.class, 10);
        dietMap.put(Caterpillar.class, 90);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }

}
