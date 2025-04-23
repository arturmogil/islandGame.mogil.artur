package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;

import java.util.HashMap;
import java.util.Map;

public class Fox extends Predator {
    public Fox(Location location) {
        super(location);
    }

    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Mouse.class, 90);
        dietMap.put(Rabbit.class, 70);
        dietMap.put(Squirrel.class, 60);
        dietMap.put(Duck.class, 80);
        dietMap.put(Caterpillar.class, 40);
        dietMap.put(Beaver.class, 40);
        dietMap.put(Sheep.class, 60);
        dietMap.put(Goat.class, 50);
        dietMap.put(Boa.class, 20);
        dietMap.put(Eagle.class, 5);
        dietMap.put(Hyena.class, 5);
        dietMap.put(Owl.class, 10);
        dietMap.put(Skunk.class, 30);
        dietMap.put(Wolf.class, 5);
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
