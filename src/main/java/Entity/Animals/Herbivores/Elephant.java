package Entity.Animals.Herbivores;


import Environment.Location;

public class Elephant extends Herbivore {
    public Elephant(Location location) {
        super(location);
        this.weight = 500;
        this.maxCountPerCell = 3;
        this.speed = 1;
        this.requiredFood = 20.0;
    }

}
