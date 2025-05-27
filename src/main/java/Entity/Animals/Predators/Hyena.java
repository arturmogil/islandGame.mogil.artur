package Entity.Animals.Predators;

import Entity.Animals.Animal;
import Entity.Animals.Herbivores.*;
import Environment.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Hyena extends Predator {
    public Hyena(Location location) {
        super(location);
        this.weight = 8;
        this.maxCountPerCell = 10;
        this.speed = 3;
        this.requiredFood = 2.0;
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();
    static {
        dietMap.put(Rabbit.class, 60);
        dietMap.put(Mouse.class, 80);
        dietMap.put(Squirrel.class, 70);
        dietMap.put(Duck.class, 40);
        dietMap.put(Caterpillar.class, 10);
        dietMap.put(Giraffe.class, 30);
        dietMap.put(Bison.class, 60);
        dietMap.put(Buffalo.class, 10);
        dietMap.put(Camel.class, 20);
        dietMap.put(Deer.class, 50);
        dietMap.put(Kangaroo.class, 50);
        dietMap.put(Sheep.class, 40);
        dietMap.put(Bear.class, 5);
        dietMap.put(Boa.class, 10);
        dietMap.put(Panda.class, 20);
        dietMap.put(Rhino.class, 15);
        dietMap.put(Owl.class, 10);
        dietMap.put(Panther.class, 20);
        dietMap.put(Skunk.class, 30);
        dietMap.put(Wolf.class, 60);
    }

    protected Map<Class<? extends Animal>, Integer> getDietMap() {
        return dietMap;
    }


}
