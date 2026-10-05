public class floatarraysum {
    public static void main(String[] args) {
        float[] arr = {98.5f, 90.2f, 67.9f, 99.9f, 89.7f };
        float sum = 0;

        for(int i=0; i<arr.length; i++)
        {
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
