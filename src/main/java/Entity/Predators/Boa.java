package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;

import java.util.HashMap;
import java.util.Map;

public class Boa extends Predator {
    public Boa(Location location) {
        super(location);
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();
    static {
        dietMap.put(Rabbit.class, 20);
        dietMap.put(Mouse.class, 40);
        dietMap.put(Duck.class, 10);
        dietMap.put(Squirrel.class, 30);
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
