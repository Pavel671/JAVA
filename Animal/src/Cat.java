public class Cat extends Animal {

    public Cat(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }


    public void catInfo() {
        if (run >= 200 || swim > 0) return;
        System.out.println("Кот " + name + " Пробежал " + run + " метров"+ "");
    }
}



