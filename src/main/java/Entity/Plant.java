package Entity;

public class Plant {
    public static final int MAX_GRASS_PER_CELL = 200;
    private int amount;

    public Plant(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void decrease(int amountToEat) {
        amount = Math.max(0, amount - amountToEat);
    }

    public void grow(int newAmount) {
        amount = Math.min(MAX_GRASS_PER_CELL, amount + newAmount);
    }

}
