public class Main {
    public static void main(String[] args) {

        Animal animals = new Animal();
        Cat cat = new Cat("Мурзик", 100, 0);
        animals.animalInfo();
        cat.catInfo();
        Dog dog = new Dog("Бобик", 125, 5);
        animals.animalInfo();
        dog.dogInfo();

    }
}



