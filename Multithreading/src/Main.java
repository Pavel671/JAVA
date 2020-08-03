import java.util.Arrays;

public class Main {
    private static final int size = 200000;
    private static final int h = size / 2;

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.One();
        main.Two();
    }

    private void Two() throws InterruptedException {
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long finish = System.currentTimeMillis();
        Thread.sleep(1000);
        long elapsed = finish - start;
        System.out.println("The division of the array: " + elapsed);

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


        long startTwo = System.currentTimeMillis();
        Thread.sleep(1000);
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long endTwo = System.currentTimeMillis();
        Thread.sleep(1000);
        System.out.println("Splice : " + (endTwo - startTwo));
        System.out.println("End of the method: " + (endTwo - start));
    }

    private void TwoInternal(float[] arr, int number) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        Thread.sleep(1000);
        System.out.println(String.format("Time of the thread %d execution %s", number, String.valueOf(end - start)));
    }
    private void One() throws InterruptedException {
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);// Заполнение массива значением 1
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finish = System.currentTimeMillis();
        Thread.sleep(1000);
        long elapsed = finish - start;
        System.out.println("End of the method");
        System.out.println(System.currentTimeMillis() - finish);
        System.out.println("Operating time: " + elapsed);
    }
}













