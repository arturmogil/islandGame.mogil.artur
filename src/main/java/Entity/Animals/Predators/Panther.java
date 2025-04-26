package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.*;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Panther extends Predator {
    public Panther(Location location) {
        super(location);
        this.weight = 50;
        this.maxCountPerCell = 10;
        this.speed = 3;
        this.requiredFood = 15.0;
    }

    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();
    static {
        dietMap.put(Kangaroo.class, 30);
        dietMap.put(Panda.class, 30);
        dietMap.put(Eagle.class, 70);
        dietMap.put(Goat.class, 50);
        dietMap.put(Sheep.class, 60);
        dietMap.put(Beaver.class, 30);
        dietMap.put(Bison.class, 30);
        dietMap.put(Camel.class, 70);
        dietMap.put(Deer.class, 80);
        dietMap.put(Horse.class, 20);
        dietMap.put(Rhino.class, 10);
        dietMap.put(Anaconda.class, 40);
        dietMap.put(Bear.class, 30);
        dietMap.put(Boa.class, 30);
        dietMap.put(Hippo.class, 20);
        dietMap.put(Fox.class, 30);
        dietMap.put(Hyena.class, 20);
        dietMap.put(Owl.class, 20);
        dietMap.put(Skunk.class, 10);
        dietMap.put(Wolf.class, 40);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }


}
