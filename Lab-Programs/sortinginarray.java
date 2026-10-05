import java.util.Arrays;

public class sortinginarray {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 68, 97, 9, 45, 5, 8, 6, 7, 9989, 4, 559, 7, 55, 6 };

        // first we check this array is sorted or not

        boolean issorted = true; // for check ans in true or false //we set this by default true

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                issorted = false;
            }
        }

        if (issorted) {
            System.out.println("the array is sorted");
        } else {
            System.out.println("the array is not sorted");
        }

        // we sort this array if it is not sorted before

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
