package Entity.Animals.Herbivores;


import Environment.Location;

public class Caterpillar extends Herbivore {
    public Caterpillar(Location location) {
        super(location);
        this.weight = 0.01;
        this.maxCountPerCell = 1000;
        this.speed = 0;
        this.requiredFood = 0;
    }

}
