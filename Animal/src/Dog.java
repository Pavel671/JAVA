public class Dog extends Animal {
    private final int run = 500;
    private final int swim = 10;
    private final double jump = 0.5;

    @Override
    protected void run(int length) {
        if ((length < 0) || (length > run)) {
            System.out.println("dog.run: false");
        } System.out.println("dog.run: true");
    }

    @Override
    public void swim(int length) {
        if ((length < 0) || (length > swim)) {
            System.out.println("dog.swim: false");
        } System.out.println("dog.swim: true");
    }

    @Override
    public void jump(double height) {
        if ((height >= 0) && (height <= jump)){
            System.out.println("dog.jump: true");
        }else {
            System.out.println("dog.jump: false");
        }
    }

    @Override
    public void info() {
        System.out.println();
    }
}
