public class Plate {
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString() {
        return "В тарелке осталось: " + amountOfFood;
    }

    void decreaseFood(int eating) {
        if (amountOfFood >= eating) {
            amountOfFood -= eating;
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {
        amountOfFood += amount;
    }
}




