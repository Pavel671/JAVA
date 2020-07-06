public class Cat extends Animal {
    private final int run = 200;
    private final double jump = 2.0;


    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= run)) System.out.println("cat.run: true");
        else System.out.println("cat.run: false");
    }

    @Override
    public void swim(int length) {
        System.out.println("Cats usually do not want to swim");
    }

    @Override
    public void jump(double height) {
        if ((height >= 0) && (height <= jump)) System.out.println("cat.jump: true");
        else System.out.println("cat.jump: fase");
    }

    @Override
    public void info() {
        System.out.println();
    }
}




