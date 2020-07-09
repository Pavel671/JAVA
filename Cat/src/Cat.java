public class Cat {
    private String name;
    private int eating;
    private boolean satiety;

    Cat(String name, int eating) {
        this.name = name;
        this.eating = eating;
        this.satiety = false;
    }

    @Override
    public String toString() {
        return "\nКот: " + name + " \nРацион: " + eating + "\nСытость: " + satiety;
    }

    void eat(Plate plate) {
        if (plate.getAmountOfFood() > eating) {
            plate.decreaseFood(eating);
            satiety = true;
        }
    }
}

