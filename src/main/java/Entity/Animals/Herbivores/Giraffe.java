package Entity.Animals.Herbivores;


import Environment.Location;

public class Giraffe extends Herbivore {
    public Giraffe(Location location) {
        super(location);
        this.weight = 200;
        this.maxCountPerCell = 10;
        this.speed = 2;
        this.requiredFood = 20.0;
    }

}
