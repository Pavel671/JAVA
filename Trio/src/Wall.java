// стена
public class Wall extends Obstacle {

    private final int heigth;

        public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
        }
         public int getHeigth()
         {
             return heigth;
         }

        @Override
        protected boolean moving(Human human) {
            System.out.println("Стена" + super.getName() + "Высота: " + this.heigth);

            human.jump();

            if (getHeigth() <= human.getJump()) {
                System.out.println("Человек перепрыгнул");

                return true;
            } else {
                System.out.println("Человек не перепрыгныл");

                return false;
            }
        }

        @Override
        protected boolean moving(Robot robot) {
            System.out.println("Стена " + super.getName() + "высота: " + this.heigth);

            robot.jump();

            if (getHeigth() <= robot.getJump()) {
                System.out.println("Робот перепрыгнул");

                return true;
            } else {
                System.out.println("Робот не перепрыгнул");

                return false;
            }
        }

        @Override
        protected boolean moving(Cat cat) {
            System.out.println("Стена " + super.getName() + " высота: " + this.heigth);

            cat.jump();

            if (getHeigth() <= cat.getJump()) {
                System.out.println("Кот перепрыгнул");

                return true;
            } else {
                System.out.println("Кот не перепрыгнул");

                return false;
            }
        }
    }











