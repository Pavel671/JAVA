public class Human implements Action {
    public int run;
    public int jump;


    public Human(int jump, int run) {
        this.jump = jump;
        this.run = run;
    }


    @Override
    public void run() {
        System.out.println("Человек пробежал " + getRun());
    }


    @Override
    public void jump() {
        System.out.println("Человек прыгнул " + getJump());
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }
}

