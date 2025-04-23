package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;

import java.util.HashMap;
import java.util.Map;

public class Owl extends Predator {
    public Owl(Location location) {
        super(location);
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
