package Entity.Animals.Herbivores;

import Environment.Location;

public class Rabbit extends Herbivore {
    public Rabbit(Location location) {
        super(location);
        this.weight = 2;
        this.maxCountPerCell = 150;
        this.speed = 2;
        this.requiredFood = 0.45;
    }


}
