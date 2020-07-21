import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Action[] actions = new Action[3]; // массив участников
        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human(8, 1);
        actions[1] = new Robot(25, 0);
        actions[2] = new Cat(9, 5);


        Obstacle[] obstacles = new Obstacle[3];//массив препятствий

        boolean isRoad;{
            int i = 0;
            while (i < obstacles.length) {
                isRoad = rand.nextBoolean();
                if (isRoad) {
                    obstacles[i] = new Treadmill("Беговая дорожка " + i, distance);
                } else {
                    obstacles[i] = new Wall("Стена " + i, heigth);
                }
                i++;

            }
        }

        int i = 0;
        while (i < actions.length) {
            boolean result = true;
            int j = 0;
                while (j < obstacles.length) {

                    if (Human.class == actions[i].getClass()) {
                     result = obstacles[j].moving((Human) actions[i]);
                    }

                    if (Robot.class == actions[i].getClass()) {
                    result = obstacles[j].moving((Robot) actions[i]);
                    }

                    if (Cat.class == actions[i].getClass()) {
                    result = obstacles[j].moving((Cat) actions[i]);
                    }

                     if (!result) {
                    break;
                    }
                    j++;
                }

            if (result) {
                System.out.println("успешно ");
            } else {
                System.out.println("не смог ");
            }
            i++;
        }
    }
}



