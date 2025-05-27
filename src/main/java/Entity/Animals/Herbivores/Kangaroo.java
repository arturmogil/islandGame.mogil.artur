package Entity.Animals.Herbivores;

import Environment.Location;

public class Kangaroo extends Herbivore {
    public Kangaroo(Location location) {
        super(location);
        this.weight = 100;
        this.maxCountPerCell = 10;
        this.speed = 4;
        this.requiredFood = 5;
    }


}
