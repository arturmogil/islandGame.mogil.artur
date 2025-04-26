package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Plant;
import Environment.Location;

public abstract class Herbivore extends Animal {
    public Herbivore(Location location) {
        this.currentLocation = location;
        location.addAnimal(this);
    }

    @Override
    public void eat() {
        if (currentFood >= requiredFood) {
            hungryDays = 0;
            return;
        }
        Plant grass = currentLocation.getGrass();
        if (grass == null || grass.getAmount() <= 0) {
            hungryDays++;
            return;
        }
        int availableGrass = grass.getAmount();
        int neededGrass = (int) Math.ceil(requiredFood - currentFood);
        int actualEaten = Math.min(availableGrass, neededGrass);
        currentFood += actualEaten;
        grass.decrease(actualEaten);
        if (currentFood < requiredFood) {
            hungryDays++;
        } else {
            hungryDays = 0;
        }
        // Логування для перевірки
        //System.out.println(this + " ate " + actualEaten + " grass and gained " + actualEaten + " food. Gained food " + currentFood);

    }

}
