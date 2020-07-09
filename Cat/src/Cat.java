public class Cat {
    private final String name;
    private final int eating;
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
        if (plate.getVolumeFood() > eating) {
            plate.decreaseFood(eating);
            satiety = true;
        }
    }
}

