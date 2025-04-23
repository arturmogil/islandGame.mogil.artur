package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;

import java.util.HashMap;
import java.util.Map;

public class Hyena extends Predator {
    public Hyena(Location location) {
        super(location);
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();
    static {
        dietMap.put(Rabbit.class, 60);
        dietMap.put(Mouse.class, 80);
        dietMap.put(Squirrel.class, 70);
        dietMap.put(Duck.class, 40);
        dietMap.put(Caterpillar.class, 10);
        dietMap.put(Giraffe.class, 30);
        dietMap.put(Bison.class, 10);
        dietMap.put(Buffalo.class, 10);
        dietMap.put(Camel.class, 20);
        dietMap.put(Deer.class, 50);
        dietMap.put(Kangaroo.class, 10);
        dietMap.put(Sheep.class, 40);
        dietMap.put(Bear.class, 5);
        dietMap.put(Boa.class, 10);
        dietMap.put(Eagle.class, 0);
        dietMap.put(Rhino.class, 5);
        dietMap.put(Owl.class, 10);
        dietMap.put(Panther.class, 20);
        dietMap.put(Skunk.class, 10);
        dietMap.put(Wolf.class, 10);
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
