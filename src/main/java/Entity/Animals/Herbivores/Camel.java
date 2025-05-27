package Entity.Animals.Herbivores;


import Environment.Location;

public class Camel extends Herbivore {
    public Camel(Location location) {
        super(location);
        this.weight = 150;
        this.maxCountPerCell = 5;
        this.speed = 4;
        this.requiredFood = 10.0;
    }

}
