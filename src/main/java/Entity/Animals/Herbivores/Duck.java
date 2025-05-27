package Entity.Animals.Herbivores;


import Environment.Location;

public class Duck extends Herbivore {
    public Duck(Location location) {
        super(location);
        this.weight = 1;
        this.maxCountPerCell = 200;
        this.speed = 4;
        this.requiredFood = 0.15;
    }

}
