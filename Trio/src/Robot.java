public class Robot implements Action {
    private final int run;
    private final int jump;

    @Override
    public void action(int run, int jump){
        System.out.println("run: " + run + "jump: " + jump);
    }

    public Robot(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void run() {
        System.out.println("Робот пробежал " + getRun());


    }

    @Override
    public void jump() {
        System.out.println("Робот прыгнул " + getJump());


    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }
}
