package Entity.Animals.Herbivores;

import Environment.Location;

public class Mouse extends Herbivore {
    public Mouse(Location location) {
        super(location);
        this.weight = 0.05;
        this.maxCountPerCell = 500;
        this.speed = 1;
        this.requiredFood = 0.01;
    }


}
