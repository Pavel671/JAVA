public class Cat implements Action {
    private final int jump;
    private final int run;

    public Cat(int jump, int run) {
        this.jump = jump;
        this.run = run;
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

    public int getRun(){

        return run;
    }
}


