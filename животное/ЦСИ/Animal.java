public abstract class Animal {
    public Animal() {
    }
    protected void run(int length) {
    }
    protected void swim(int length) {
    }
    protected void jump(double height) {
    }
    protected String name;
    public Animal(String name) {
        this.name = name;
    }


    public void info() {
        System.out.println();
    }
}

