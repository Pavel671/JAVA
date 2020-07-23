/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
 и просуммировать. Если в каком-то элементе массива преобразование не удалось
 (например, в ячейке лежит символ или текст вместо числа),
 должно быть брошено исключение MyArrayDataException,
 с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод,
обработать возможные исключения MySizeArrayException
и MyArrayDataException, и вывести результат расчета.
 */


public class Exception {
    public static void main(String[] args) {
        int result = 0;

        String[][] array = {{"1","2","3","4"},{"1","2","3","4"}};
        String[][] error_array = {{"1","2","3","4","5"},{"1","2","3","4","5"}};
        String[][] error_data = {{"1","w","3","4",},{"1","2","3","4"}};
        System.out.println("START\n");


        try {
            result = analyze(array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Try");
            System.out.println("Result "+ result);
        }


        try {
            result = 0;
            result = analyze(error_array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nError array");
            System.out.println("Result "+ result);
        }

        System.out.println("Error data\n");
        try {
            result = 0;
            result = analyze(error_data);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Result "+ result);
        }

        System.out.println("STOP");
    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;
        int value;
        int row;
        int cell;

        if(array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i=1;i<3;i++){
            row = i;
            for(int j=1;j<5;j++){
                cell = j;
                try{
                    value = Integer.parseInt(array[i-1][j-1]);
                    summ += value;
                } catch (IllegalArgumentException e){
                    String message = " in "+ row +" row, "+ cell +" cell";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return summ;
    }
}

