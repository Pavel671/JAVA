// беговая дорожка

public class Treadmill extends Obstacle {

    private int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println("" + super.getName() + " длина: " + this.length);

        human.run();

        if (getLength() <= human.getRun()) {
            System.out.println("Человек пробежал");

            return true;
        } else {
            System.out.println("Человек не пробежал");

            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {
        System.out.println("" + super.getName() + " длина: " + this.length);

        robot.run();

        if (getLength() <= robot.getRun()) {
            System.out.println("Робот пробежал");

            return true;
        } else {
            System.out.println("Робот не пробежал");

            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println("" + super.getName() + " длина: " + this.length);

        cat.run();

        if (getLength() <= cat.getRun()) {
            System.out.println("Кот пробежал");

            return true;
        } else {
            System.out.println("Кот не пробежал");

            return false;
        }
    }
}

