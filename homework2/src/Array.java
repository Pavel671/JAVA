public class Array {
    /*1.Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                System.out.print(arr[i] + " ");

            } else {
                arr[i] = 0;
                System.out.print(arr[i] + "");
            }
        }
    }
    //2.Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;


    public static void fullArray(String[] args) {
        int[] array = new int[8];
        int j = 0;
        for (int i = 0; i < array.length; i++, j = j + 3) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }
    }



/*3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 по нему циклом, и числа меньшие 6 умножить на 2
 */

    public static void changeArray(String[] args) {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
                System.out.print(+w[i] + " ");
            } else
                System.out.print(+w[i] + " ");


        }
    }

/* 4.Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое), и с помощью
цикла(-ов) заполнить его диагональные элементы единицами;
 */

        public static void fullDiagonal(String args[]){
            int[][] arr = new int[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, a = arr[i].length - 1; j < arr[i].length; j++, a--) {
                    if (i == j || i == a) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
/* ** Задать одномерный массив и
 найти в нем минимальный и максимальный элементы (без помощи интернета);
 */


        public static void Array(String[]args){
            int[] array = new int[]{8, 56, 85, 22, 1, 10};
            int max = 0;
            //int min = new int;
            int min;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Максимальный элемент: " + max);

            array = new int[]{8, 56, 85, 22, 45, 10};
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                }
            }
            System.out.println("Минимальный элемент: " + array[0]);
        }
    }






























