public class main {                           //задание 1
    public static void main(String[] args) {
        byte two = 125;                      //задание 2
        System.out.println(two);

        short s = 32761;
        System.out.println(s);

        int i = 7;
        System.out.println(i);

        long l = 220L;
        System.out.println(l);

        float fl = 2.2f;
        System.out.println(fl);

        double dbl = 33.5d;
        System.out.println(dbl);

        boolean m = 8 > 9;//boolean b = 10 >9 True
        System.out.println(m);
    }

    public static int expression(int a, int b, int c, int d) {     //задание 3
        int result = a * (b + (c / d));
        return result;
    }

    public static boolean task10and20(int x1, int x2) {         //задание 4
        int task10and20 = x1 + x2;
        if (task10and20 >= 10 && task10and20 <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positive_negative(int i) {        //задание 5
        if (i >= 0) {
            System.out.println("positive i");
        } else {
            System.out.println("negative i");
        }
    }

    public static boolean isNegative(int i) {          //задание 6
        if (i < 0) {
            return true;
        }
        return false;
    }


    public static void greetings(String name) {    //задание 7

        System.out.println("Привет," + name + ".");
    }


    public static void leap_year(int i) {             //задание 8
        if(i%4 == 0  && i%100 != 0 || i%400 == 0) {

            System.out.println("Год високосный");
        }
        System.out.println("Год невисокосный");

    }
}