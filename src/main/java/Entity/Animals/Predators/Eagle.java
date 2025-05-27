package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.Duck;
import Entity.Animals.Herbivores.Mouse;
import Entity.Animals.Herbivores.Rabbit;
import Entity.Animals.Herbivores.Squirrel;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Eagle extends Predator {
    public Eagle(Location location) {
        super(location);
        this.weight = 6;
        this.maxCountPerCell = 20;
        this.speed = 4;
        this.requiredFood = 1.0;
    }

    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Mouse.class, 90);
        dietMap.put(Rabbit.class, 90);
        dietMap.put(Duck.class, 80);
        dietMap.put(Squirrel.class, 60);
        dietMap.put(Owl.class, 40);
        dietMap.put(Anaconda.class, 50);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }

}
