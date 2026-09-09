import java.util.Arrays;


public class merged {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,5,7,9};
        int[] array2 = {5,8,9,5,6,2};

        int[] merged = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            merged[i + array1.length] = array2[i];
        }

        Arrays.sort(merged);
        int lenght = merged.length;
        double temp;

        if (lenght % 2 == 1) {
            temp = merged[lenght / 2];
        } else {
            temp = (merged[lenght/2 - 1] + merged[lenght/2]) / 2.0;

        }

        System.out.println("median is : " + temp);
    }
}
