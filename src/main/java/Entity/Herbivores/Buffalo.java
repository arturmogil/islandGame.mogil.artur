package Entity.Herbivores;

import Entity.Animal;
import Entity.Herbivore;
import Environment.Location;

public class Buffalo extends Herbivore {
    public Buffalo(Location location) {
        super(location);
    }

    @Override
    public void move() {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
