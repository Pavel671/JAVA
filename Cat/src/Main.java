public class Main {
    public static void main(String[] args) {
        System.out.println();
        Cat[] x = {new Cat("Barsik", 25), new Cat("Mursik", 15), new Cat("Boris", 10)};
        Plate plate = new Plate(0);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("\nВ тарелку положили");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("\nКоты едят:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
