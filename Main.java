public class Main {
    public static void main(String[] args) {
        // Original array of digits
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        // Convert array to integer
        int number = convertArrayToInteger(digits);

        // Add +1 to the number
        number += 1;

        // Convert the integer back into an array of digits
        int[] newDigits = convertIntegerToDigitsArray(number);

        // Print the original array, the number, and the new array of digits
        System.out.println("Original array: " + java.util.Arrays.toString(digits));
        System.out.println("Converted number + 1: " + number);
        System.out.println("Array of digits from the result: " + java.util.Arrays.toString(newDigits));
    }

    // Function to convert an array of digits into a single integer
    public static int convertArrayToInteger(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return number;
    }

    // Function to convert an integer into an array of digits
    public static int[] convertIntegerToDigitsArray(int number) {
        // Special case for 0
        if (number == 0) {
            return new int[]{0};
        }

        // Find the number of digits in the integer
        int temp = number;
        int length = 0;
        while (temp > 0) {
            length++;
            temp /= 10;
        }

        // Create an array to store the digits
        int[] digitsArray = new int[length];

        // Fill the array with digits
        for (int i = length - 1; i >= 0; i--) {
            digitsArray[i] = number % 10;
            number /= 10;
        }

        return digitsArray;
    }
}
