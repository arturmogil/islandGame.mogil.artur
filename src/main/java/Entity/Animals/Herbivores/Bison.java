package Entity.Animals.Herbivores;


import Environment.Location;

public class Bison extends Herbivore {
    public Bison(Location location) {
        super(location);
        this.weight = 300;
        this.maxCountPerCell = 5;
        this.speed = 3;
        this.requiredFood = 20.0;
    }

}
