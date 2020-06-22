import java.util.Random;
import java.util.Scanner;
/*Написать программу, которая загадывает случайное число от 0 до 9
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить,
     больше ли указанное пользователем число,
      чем загаданное, или меньше.
      После победы или проигрыша выводится
      запрос – «Повторить игру еще раз? 1 – да
      / 0 – нет»(1 – повторить, 0 – нет).
     */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            int number = random.nextInt(10);
            int a = -1;
            int Count = 0;
            System.out.println("Угадайте число от 0 до 9");
            while (Count < 3 && a != number) {
                a = scanner.nextInt();
                if (a == number) {
                    System.out.println("Поздравляю,вы угадали!");
                } else if (a < number) {
                    System.out.println("Вы ввели слишком маленькое число");
                    Count++;
                } else {
                    System.out.println("Вы ввели слишком большое число");
                    Count++;
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да,0 – нет");
        } while (scanner.nextInt() == 1);
    }
}












