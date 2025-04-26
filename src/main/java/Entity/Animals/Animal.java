package Entity.Animals;

import Environment.Island;
import Environment.Location;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {
    protected double weight;
    protected static int maxCountPerCell;
    protected int speed;
    protected double requiredFood;
    protected double currentFood =0.0;
    protected Location currentLocation;
    protected boolean hasReproduced = false;
    protected int hungryDays = 0;

    public double getRequiredFood() {
        return requiredFood;
    }
    public double getWeight() {
        return weight;
    }
    public int getSpeed() {
        return speed;
    }
    public int getMaxCountPerCell() {
        return maxCountPerCell;
    }
    public void setCurrentLocation(Location location) {
        this.currentLocation = location;
    }
    public void setCurrentFood(double currentFood) {
        this.currentFood = currentFood;
    }

    public boolean isStarvingToDeath() {
        return hungryDays >= 3;
    }
    public abstract void eat();

    public void move(Island island) {
        if (currentLocation == null) return;

        int speed = getSpeed();
        int direction = ThreadLocalRandom.current().nextInt(5);
        int steps = ThreadLocalRandom.current().nextInt(speed + 1);
        int oldX = -1, oldY = -1;
        for (int y = 0; y < island.getHeight(); y++) {
            for (int x = 0; x < island.getWidth(); x++) {
                if (island.getLocation(x, y) == currentLocation) {
                    oldX = x;
                    oldY = y;
                    break;
                }
            }
        }
        if (oldX == -1 || oldY == -1) return;

        int newX = oldX, newY = oldY;
        switch (direction) {
            case 0 -> newX = Math.max(0, oldX - steps);
            case 1 -> newX = Math.min(island.getWidth() - 1, oldX + steps);
            case 2 -> newY = Math.max(0, oldY - steps);
            case 3 -> newY = Math.min(island.getHeight() - 1, oldY + steps);
            case 4 -> { return; }
        }
        if (newX == oldX && newY == oldY) return;
        Location newLocation = island.getLocation(newX, newY);

        long sameTypeCount = newLocation.getAnimals().stream()
                .filter(a -> a.getClass().equals(this.getClass()))
                .count();
        if (sameTypeCount < getMaxCountPerCell()) {
            currentLocation.removeAnimal(this);
            newLocation.addAnimal(this);
            setCurrentLocation(newLocation);
        }
    }

    public boolean hasReproduced() {
        return hasReproduced;
    }
    public void trueReproduceFlag() {
        this.hasReproduced = true;
    }
    public void falseReproduceFlag() {
        this.hasReproduced = false;
    }
    protected boolean canReproduce(Animal animal1, Animal animal2) {
        if (animal1.hasReproduced() || animal2.hasReproduced()) {
            return false;
        }
        if (!animal1.getClass().equals(animal2.getClass())) {
            return false;
        }
        int roll = ThreadLocalRandom.current().nextInt(100);
        return roll < 90;
    }
    public void reproduce() {
        List<Animal> animals = new ArrayList<>(currentLocation.getAnimals());
        for (int i = 0; i < animals.size(); i++) {
            Animal parent1 = animals.get(i);
            if (parent1.hasReproduced()) continue;
            for (int j = i + 1; j < animals.size(); j++) {
                Animal parent2 = animals.get(j);
                if (parent2.hasReproduced()) continue;
                if (canReproduce(parent1, parent2)) {
                    try {
                        Animal offspring = parent1.getClass().getConstructor(Location.class).newInstance(currentLocation);

                        parent1.trueReproduceFlag();
                        parent2.trueReproduceFlag();
                        offspring.trueReproduceFlag();

                        // Логування для перевірки
                        //System.out.println(parent1 + " and " + parent2 + " has reproduced. New offspring: " + offspring);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
