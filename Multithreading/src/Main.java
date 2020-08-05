import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];

    public static void main(String[] args)  {
        Main main = new Main();
        main.One();
        main.Two();
    }


    private void One(){
        Arrays.fill(arr, 1.0f);// Заполнение массива значением 1
        long start = System.currentTimeMillis();
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finish = System.currentTimeMillis();
        System.out.println("Operating time: " + (finish - start));
    }

    private void Two() {
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long split = System.currentTimeMillis();
        System.out.println("The division of the array: " + (split - start));

        Thread thread1 = new Thread(() -> {
            try {
                this.TwoInternal(arr1, 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                this.TwoInternal(arr2, 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
        }


        long startTwo = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long endTwo = System.currentTimeMillis();
        System.out.println("Splice : " + (endTwo - startTwo));
        System.out.println("End of the method: " + (endTwo - start));
    }

    private void TwoInternal(float[] arr, int number) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Time of the thread %d execution %s", number, String.valueOf(end - start)));
    }
}







