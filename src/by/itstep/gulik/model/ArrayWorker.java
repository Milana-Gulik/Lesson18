package by.itstep.gulik.model;

public class ArrayWorker {
    public static int max(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        int max = array[0];
//        int max = Integer.MIN_VALUE;


        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
