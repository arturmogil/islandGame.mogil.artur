package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;

import java.util.HashMap;
import java.util.Map;

public class Anaconda extends Predator {
    public Anaconda(Location location) {
        super(location);
    }

    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Mouse.class, 80);
        dietMap.put(Rabbit.class, 40);
        dietMap.put(Duck.class, 40);
        dietMap.put(Goat.class, 10);
        dietMap.put(Sheep.class, 10);
        dietMap.put(WildBoar.class, 15);
        dietMap.put(Beaver.class, 10);
        dietMap.put(Bison.class, 5);
        dietMap.put(Buffalo.class, 5);
        dietMap.put(Squirrel.class, 20);
        dietMap.put(Boa.class, 30);
        dietMap.put(Fox.class, 5);
        dietMap.put(Hyena.class, 5);
        dietMap.put(Panther.class, 5);
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
