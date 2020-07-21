public class Human implements Action {
    public final int run;
    public final int jump;

    @Override
    public void action(int run, int jump){
        System.out.println("run: " + run + "jump: " + jump);
    }

    public Human(int run, int jump) {
        this.run = run;
        this.jump = jump;
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

