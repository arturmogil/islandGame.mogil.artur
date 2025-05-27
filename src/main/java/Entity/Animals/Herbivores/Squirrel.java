package Entity.Animals.Herbivores;

import Environment.Location;

public class Squirrel extends Herbivore {
    public Squirrel(Location location) {
        super(location);
        this.weight = 1;
        this.maxCountPerCell = 100;
        this.speed = 2;
        this.requiredFood = 0.1;
    }
}
