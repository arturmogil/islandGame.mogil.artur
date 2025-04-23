package Entity;

import Environment.Location;

public abstract class Animal {
    protected int weight;
    protected int maxCountPerCell;
    protected int speed;
    protected double requiredFood;
    protected double currentFood =0.0;
    protected boolean isAlive = true;
    protected Location currentLocation;

    public abstract void eat();
    public abstract void move();
    public abstract Animal reproduce();

    public int getWeight() {
        return weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void die() {
        isAlive = false;
    }

    public void setCurrentLocation(Location location) {
        this.currentLocation = location;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
