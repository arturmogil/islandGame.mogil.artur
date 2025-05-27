package Entity.Animals.Herbivores;

import Environment.Location;

public class WildBoar extends Herbivore {
    public WildBoar(Location location) {
        super(location);
        this.weight = 400;
        this.maxCountPerCell = 50;
        this.speed = 2;
        this.requiredFood = 50.0;
    }
}
