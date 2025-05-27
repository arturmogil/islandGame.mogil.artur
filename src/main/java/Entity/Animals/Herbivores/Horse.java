package Entity.Animals.Herbivores;

import Environment.Location;

public class Horse extends Herbivore {
    public Horse(Location location) {
        super(location);
        this.weight = 400;
        this.maxCountPerCell = 20;
        this.speed = 3;
        this.requiredFood = 60.0;
    }

}
