package Entity.Animals.Herbivores;

import Environment.Location;

public class Rhino extends Herbivore {
    public Rhino(Location location) {
        super(location);
        this.weight = 400;
        this.maxCountPerCell = 5;
        this.speed = 2;
        this.requiredFood = 20.0;
    }

}
