package Project1;

import java.util.Arrays;

public class Assignment8 {
    public static void main(String[] args) {
        int[] array = new int[]{17, 28, 9, 4, 22, 7, 1, 3, 19, 42, 58, 47};
        Arrays.sort(array);

        System.out.println("Minimum value: " + array[0]);

        System.out.println("Maximum value: " + array[array.length - 1]);

    }

}

