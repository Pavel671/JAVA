public class Dog extends Animal {
    public Dog(String name, int run, int swim) {
        super();
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    public void dogInfo() {
        if (run >= 200 || swim >= 10) {
            return;
        }
        System.out.println("Собака " + name + " пробежал " + run + " метров" + " проплыл " + swim + " метров");
    }
}
