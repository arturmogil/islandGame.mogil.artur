package Entity.Animals.Herbivores;

import Environment.Location;

public class Panda extends Herbivore {
    public Panda(Location location) {
        super(location);
        this.weight = 100;
        this.maxCountPerCell = 5;
        this.speed = 2;
        this.requiredFood = 5.0;
    }

}
