package Entity.Animals.Herbivores;

import Environment.Location;

public class Beaver extends Herbivore {
    public Beaver(Location location) {
        super(location);
        this.weight = 20;
        this.maxCountPerCell = 30;
        this.speed = 2;
        this.requiredFood = 1.0;
    }

}
