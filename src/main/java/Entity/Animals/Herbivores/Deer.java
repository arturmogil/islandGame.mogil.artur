package Entity.Animals.Herbivores;


import Environment.Location;

public class Deer extends Herbivore {
    public Deer(Location location) {
        super(location);
        this.weight = 300;
        this.maxCountPerCell = 20;
        this.speed = 4;
        this.requiredFood = 50.0;
    }

}
