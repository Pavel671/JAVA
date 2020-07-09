public class Plate {
    private int volumeFood;

    Plate(int amountFood) {
        this.volumeFood = amountFood;
    }

    @Override
    public String toString() {
        return "В тарелке осталось: " + volumeFood;
    }

    void decreaseFood(int eating) {
        if (volumeFood >= eating) {
            volumeFood -= eating;
        }
    }

    int getVolumeFood() {
        return volumeFood;
    }

    void increaseFood(int volume) {
        volumeFood += volume;
    }
}



