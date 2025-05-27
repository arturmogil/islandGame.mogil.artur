package Entity.Animals.Herbivores;


import Environment.Location;

public class Buffalo extends Herbivore {
    public Buffalo(Location location) {
        super(location);
        this.weight = 700;
        this.maxCountPerCell = 10;
        this.speed = 3;
        this.requiredFood = 100.0;
    }


}
