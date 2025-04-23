package Entity;

import Environment.Location;

import java.util.List;

public abstract class Herbivore extends Animal{
    public Herbivore(Location location) {
        this.currentLocation = location;
        location.addAnimal(this);
    }

    @Override
    public void eat() {
        List<Plant> plants = currentLocation.getPlants();
        if (!plants.isEmpty()) {
            currentLocation.removePlant(plants.get(0));
            currentFood += 1.0;
        }
    }
}
