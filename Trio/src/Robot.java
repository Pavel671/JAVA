public class Robot implements Action {
    private final int run;
    private final int jump;

    public Robot(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void run() {


    }

    @Override
    public void jump() {


    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }
}