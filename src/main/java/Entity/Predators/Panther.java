package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;

import java.util.HashMap;
import java.util.Map;

public class Panther extends Predator {
    public Panther(Location location) {
        super(location);
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();
    static {
        dietMap.put(Rabbit.class, 90);
        dietMap.put(Mouse.class, 80);
        dietMap.put(Squirrel.class, 70);
        dietMap.put(Goat.class, 50);
        dietMap.put(Sheep.class, 60);
        dietMap.put(Beaver.class, 30);
        dietMap.put(Bison.class, 10);
        dietMap.put(Camel.class, 5);
        dietMap.put(Deer.class, 80);
        dietMap.put(Horse.class, 20);
        dietMap.put(Rhino.class, 10);
        dietMap.put(Anaconda.class, 5);
        dietMap.put(Bear.class, 20);
        dietMap.put(Boa.class, 5);
        dietMap.put(Hippo.class, 0);
        dietMap.put(Fox.class, 5);
        dietMap.put(Hyena.class, 10);
        dietMap.put(Owl.class, 0);
        dietMap.put(Skunk.class, 10);
        dietMap.put(Wolf.class, 0);
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }

    @Override
    public void move() {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
