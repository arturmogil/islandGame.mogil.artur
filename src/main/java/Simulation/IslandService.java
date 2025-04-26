package Simulation;
import Environment.Island;
import Environment.Location;
import Entity.Animals.Animal;
import Entity.Plant;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import Entity.Animals.Predators.*;
import Entity.Animals.Herbivores.*;

public class IslandService {
    private static final Map<Class<? extends Animal>, Integer> animalMaxCountMap = new HashMap<>();
    static {
        animalMaxCountMap.put(Wolf.class, 30);
        animalMaxCountMap.put(Fox.class, 30);
        animalMaxCountMap.put(Rabbit.class, 150);
        animalMaxCountMap.put(Mouse.class, 500);
        animalMaxCountMap.put(Squirrel.class, 100);
        animalMaxCountMap.put(Duck.class, 200);
        animalMaxCountMap.put(Beaver.class, 30);
        animalMaxCountMap.put(Bison.class, 5);
        animalMaxCountMap.put(Buffalo.class, 10);
        animalMaxCountMap.put(Camel.class, 5);
        animalMaxCountMap.put(Deer.class, 20);
        animalMaxCountMap.put(Goat.class, 140);
        animalMaxCountMap.put(Sheep.class, 140);
        animalMaxCountMap.put(Bear.class, 5);
        animalMaxCountMap.put(Hyena.class, 10);
        animalMaxCountMap.put(Owl.class, 10);
        animalMaxCountMap.put(Panther.class, 10);
        animalMaxCountMap.put(Skunk.class, 5);
        animalMaxCountMap.put(Horse.class, 20);
        animalMaxCountMap.put(Elephant.class, 3);
        animalMaxCountMap.put(Caterpillar.class, 1000);
        animalMaxCountMap.put(Giraffe.class, 10);
        animalMaxCountMap.put(Hippo.class, 5);
        animalMaxCountMap.put(Kangaroo.class, 10);
        animalMaxCountMap.put(Panda.class, 5);
        animalMaxCountMap.put(Rhino.class, 5);
        animalMaxCountMap.put(WildBoar.class, 40);
        animalMaxCountMap.put(Anaconda.class, 10);
        animalMaxCountMap.put(Boa.class, 5);
        animalMaxCountMap.put(Eagle.class, 20);
    }
    public void populateGrass(Island island) {
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                Location location = island.getLocation(x, y);
                Plant currentGrass = location.getGrass();
                if (currentGrass != null) {
                    int currentAmount = currentGrass.getAmount();
                    int maxAmountToAdd = Plant.MAX_GRASS_PER_CELL - currentAmount;
                    if (currentAmount < Plant.MAX_GRASS_PER_CELL) {
                        int amountToAdd = ThreadLocalRandom.current().nextInt(0, Math.min(Plant.MAX_GRASS_PER_CELL, maxAmountToAdd) + 1);
                        currentGrass.grow(amountToAdd);
                    }
                } else {
                    int amount = ThreadLocalRandom.current().nextInt(Plant.MAX_GRASS_PER_CELL / 2, Plant.MAX_GRASS_PER_CELL + 1);
                    location.setGrass(new Plant(amount));
                }
            }
        }
    }
    public void populateAnimals(Island island) {
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                Location location = island.getLocation(x, y);
                for (Map.Entry<Class<? extends Animal>, Integer> entry : animalMaxCountMap.entrySet()) {
                    Class<? extends Animal> aClass = entry.getKey();
                    int maxCount = entry.getValue();
                    int count = ThreadLocalRandom.current().nextInt(maxCount / 2 + 1);
                    for (int i = 0; i < count; i++) {
                        try {
                            Animal animal = aClass.getConstructor(Location.class).newInstance(location);
                            location.addAnimal(animal);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    public void populateIsland(Island island) {
        populateAnimals(island);
        populateGrass(island);
    }

    public void simulateDay(Island island) {
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                Location location = island.getLocation(x, y);
                List<Animal> animals = new ArrayList<>(location.getAnimals());
                for (Animal animal : animals) {
                    animal.eat();
                    if (animal.isStarvingToDeath()) {
                        location.removeAnimal(animal);
                        //Логування для перевірки
                        //System.out.println(animal + " has died of starving on (" + x + ", " + y + ")");
                    } else {
                        animal.setCurrentFood(0);
                    }
                }
            }
        }

        reproduceInAllCells(island);
        moveAnimals(island);
        resetReproductionFlags(island);
        populateGrass(island);

        printAllOnIsland(island);
    }

    public void moveAnimals(Island island) {
        List<Animal> toMove = new ArrayList<>();
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                Location location = island.getLocation(x, y);
                toMove.addAll(new ArrayList<>(location.getAnimals()));
            }
        }
        for (Animal animal : toMove) {
            animal.move(island);
        }
    }

    public void reproduceInAllCells(Island island) {
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                Location location = island.getLocation(x, y);
                List<Animal> animalsInCell = new ArrayList<>(location.getAnimals());
                for (Animal animal : animalsInCell) {
                    animal.reproduce();
                }
            }
        }
    }
    public void resetReproductionFlags(Island island) {
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                Location location = island.getLocation(x, y);
                for (Animal animal : location.getAnimals()) {
                    animal.falseReproduceFlag();
                }
            }
        }
    }

    public void printAllOnIsland(Island island) {
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                Location location = island.getLocation(x, y);
                System.out.println("Cell [" + x + "," + y + "]");
                Map<Class<? extends Animal>, Integer> counts = new HashMap<>();
                for (Animal animal : location.getAnimals()) {
                    counts.merge(animal.getClass(), 1, Integer::sum);
                }
                for (Map.Entry<Class<? extends Animal>, Integer> entry : counts.entrySet()) {
                    String name = entry.getKey().getSimpleName();
                    System.out.println("  " + name + ": " + entry.getValue());
                }
                Plant grass = location.getGrass();
                int amount = (grass != null) ? grass.getAmount() : 0;
                System.out.println("  Plants: " + amount);
                System.out.println();
            }
        }
    }
}
