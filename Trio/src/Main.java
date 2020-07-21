import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Action[] actions = new Action[3];

        int distance = 5;
        int heigth = 2;
        actions[0] = new Human(distance, heigth);
        int distance1 = 25;
        int heigth1 = 0;
        actions[1] = new Robot(distance1, heigth1);
        int distance2 = 9;
        int heigth2 = 4;
        actions[2] = new Cat(distance2, heigth2);


        Obstacle[] obstacles = new Obstacle[6];

        boolean isRoad;
        {
            int i = 0;
            while (i < obstacles.length) {
                distance = rand.nextInt(10);
                isRoad = rand.nextBoolean();
                if (isRoad) {

                    obstacles[i] = new Treadmill("Беговая дорожка " + i, distance);
                } else {
                    obstacles[i] = new Wall("Стена " + i, heigth);
                }
                i++;
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {

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
            }

            if (result) {
                System.out.println("успешно ");
            } else {
                System.out.println("не смог ");
            }
        }
    }
}



