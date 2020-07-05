public class Dog extends Animal {
    public Dog(String name, int run, int swim, double jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;


    }

    public void dogInfo() {
        if (run >= 200 || swim >= 10 || jump >= 0.5) {
            return;
        }
        System.out.println("Собака " + name + "\n пробежал " + run + " метров" + "\n проплыл " + swim + " метров" + "\n прыгнул вверх на " + jump + " метр ");
    }
}

