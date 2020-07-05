public class Main {
    public static void main(String[] args) {

        Animal animals = new Animal();
        Cat cat = new Cat("Мурзик", 100, 0, 1);
        animals.animalInfo();
        cat.catInfo();
        Dog dog = new Dog("Бобик", 125, 5, 0.2);
        animals.animalInfo();
        dog.dogInfo();

    }
}

