package L5;

public class MainEdited extends Thread{

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1(){
        float[] arr = getArr();

        long timeStart = System.currentTimeMillis();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (float)i / 5) * Math.cos(0.2f + (float)i / 5) * Math.cos(0.4f + (float)i / 2));
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println("Метод 1: " + (timeEnd - timeStart));
    }

    private static void method2(){
        float[] arr = getArr();
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long timeStart = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        new Thread(() -> {
            for(int i = 0; i < a1.length; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + (float)i / 5) * Math.cos(0.2f + (float)i / 5) * Math.cos(0.4f + (float)i / 2));
            }
        }).start();

        new Thread(() -> {
            for(int i = 0; i < a2.length; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + (float)(i + a2.length) / 5) * Math.cos(0.2f + (float)(i + a2.length) / 5) * Math.cos(0.4f + (float)(i + a2.length) / 2));
            }
        }).start();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long timeEnd = System.currentTimeMillis();
        System.out.println("Метод 2: " + (timeEnd - timeStart));
    }

    private static float[] getArr() {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1F;
        }
        return arr;
    }
}
