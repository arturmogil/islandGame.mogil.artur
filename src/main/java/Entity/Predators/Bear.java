package Entity.Predators;

import Entity.Animal;
import Entity.Predator;
import Environment.Location;
import Entity.Herbivores.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Predator {
    public Bear(Location location) {
        super(location);
    }
    private static final Map<Class<? extends Animal>, Integer> dietMap = new HashMap<>();

    static {
        dietMap.put(Horse.class, 40);
        dietMap.put(Deer.class, 80);
        dietMap.put(Rabbit.class, 80);
        dietMap.put(Mouse.class, 90);
        dietMap.put(Goat.class, 70);
        dietMap.put(Sheep.class, 70);
        dietMap.put(WildBoar.class, 50);
        dietMap.put(Buffalo.class, 20);
        dietMap.put(Duck.class, 50);
        dietMap.put(Beaver.class, 30);
        dietMap.put(Bison.class, 10);
        dietMap.put(Camel.class, 5);
        dietMap.put(Elephant.class, 5);
        dietMap.put(Giraffe.class, 5);
        dietMap.put(Hippo.class, 5);
        dietMap.put(Kangaroo.class, 5);
        dietMap.put(Panda.class, 10);
        dietMap.put(Rhino.class, 5);
        dietMap.put(Squirrel.class, 40);
        dietMap.put(Anaconda.class, 60);
        dietMap.put(Boa.class, 30);
        dietMap.put(Eagle.class, 10);
        dietMap.put(Fox.class, 30);
        dietMap.put(Hyena.class, 25);
        dietMap.put(Panther.class, 10);
        dietMap.put(Skunk.class, 30);
        dietMap.put(Wolf.class, 20);
    }

    @Override
    protected boolean canEat(Animal animal) {
        Integer chance = dietMap.get(animal.getClass());
        if (chance == null || chance == 0) return false;

        int roll = ThreadLocalRandom.current().nextInt(100);
        return roll < chance;
    }

    @Override
    public void move() {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
