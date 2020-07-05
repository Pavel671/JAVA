public class Cat extends Animal {

    public Cat(String name, int run, int swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }


    public void catInfo() {
        if (run >= 200 || swim > 0 || jump >= 2) return;
        System.out.println("Кот " + name + "\nПробежал " + run + " метров"+ "\n прыгнул вверх на " + jump + " метр ");
    }
}
