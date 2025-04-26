package Entity.Animals.Herbivores;

import Environment.Location;

public class Hippo extends Herbivore {
    public Hippo(Location location) {
        super(location);
        this.weight = 200;
        this.maxCountPerCell = 5;
        this.speed = 1;
        this.requiredFood = 10.0;
    }


}
