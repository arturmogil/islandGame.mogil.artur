package Entity.Animals.Herbivores;

import Environment.Location;

public class Sheep extends Herbivore {
    public Sheep(Location location) {
        super(location);
        this.weight = 70;
        this.maxCountPerCell = 140;
        this.speed = 3;
        this.requiredFood = 15.0;
    }


}
