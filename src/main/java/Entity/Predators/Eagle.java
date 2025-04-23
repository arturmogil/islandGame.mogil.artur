package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;

import java.util.HashMap;
import java.util.Map;

public class Eagle extends Predator {
    public Eagle(Location location) {
        super(location);
    }

    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Mouse.class, 90);
        dietMap.put(Rabbit.class, 90);
        dietMap.put(Duck.class, 80);
        dietMap.put(Squirrel.class, 60);
        dietMap.put(Owl.class, 40);
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
