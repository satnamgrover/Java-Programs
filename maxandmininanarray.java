public class maxandmininanarray {
    public static void main(String[] args) {
        int[] arr = {522,54,34,343,34,342};
        int max =0;       // we can also use Intger.min_value *because this is minimum value of integer 
        int min = arr[0]; //we can also use Integer.max_value *because this is maximum value in integer

        for(int i:arr)
        {
            if(i>max)
            {
                max = i;
            }

        }
        for(int i:arr)
        {
            if(i<min)
            {
                min = i;
            }
        }
        System.out.println("the maximum number in array is : " + max);
        System.out.println("the minimum number in  array is : " + min);
    }
}
