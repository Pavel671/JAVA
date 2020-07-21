public class Cat implements Action {
    private final int jump;
    private final int run;

    @Override
    public void action(int run, int jump){
        System.out.println("run: " + run + "jump: " + jump);
    }

    public Cat(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }


    @Override
    public void run() {
        System.out.println("Кот пробежал " + getRun());
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул " + getJump());
    }

    public int getJump() {
        return jump;
    }

    public int getRun(){
        return run;
    }
}
