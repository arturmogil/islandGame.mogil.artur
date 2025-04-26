package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.*;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Predator {
    public Bear(Location location) {
        super(location);
        this.weight = 500;
        this.maxCountPerCell = 5;
        this.speed = 2;
        this.requiredFood = 80.0;
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Horse.class, 40);
        dietMap.put(Deer.class, 80);
        dietMap.put(Rabbit.class, 80);
        dietMap.put(Mouse.class, 90);
        dietMap.put(Goat.class, 70);
        dietMap.put(Sheep.class, 70);
        dietMap.put(WildBoar.class, 60);
        dietMap.put(Buffalo.class, 60);
        dietMap.put(Duck.class, 50);
        dietMap.put(Beaver.class, 30);
        dietMap.put(Bison.class, 10);
        dietMap.put(Camel.class, 5);
        dietMap.put(Elephant.class, 20);
        dietMap.put(Giraffe.class, 20);
        dietMap.put(Hippo.class, 10);
        dietMap.put(Kangaroo.class, 5);
        dietMap.put(Panda.class, 10);
        dietMap.put(Rhino.class, 5);
        dietMap.put(Squirrel.class, 40);
        dietMap.put(Anaconda.class, 60);
        dietMap.put(Boa.class, 30);
        dietMap.put(Eagle.class, 10);
        dietMap.put(Fox.class, 50);
        dietMap.put(Hyena.class, 25);
        dietMap.put(Panther.class, 10);
        dietMap.put(Skunk.class, 30);
        dietMap.put(Wolf.class, 20);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }

}
