package Entity.Animals.Herbivores;


import Environment.Location;

public class Goat extends Herbivore {
    public Goat(Location location) {
        super(location);
        this.weight = 60;
        this.maxCountPerCell = 140;
        this.speed = 3;
        this.requiredFood = 10.0;
    }

}
