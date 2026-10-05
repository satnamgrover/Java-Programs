import java.util.*;
import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("total numbers : ");
        int a = sc.nextInt();

        double number[] = new double[a];

        System.out.println("x series : ");
        for(int i=0; i<a; i++)
        {
            number[i] = sc.nextDouble();
            
        }
        sc.close();

        Arrays.sort(number);
        int lenght = number.length;
        System.out.println("numbers :" + Arrays.toString(number));
        double temp;
        if(lenght % 2 == 1)
        {
            //if total numbers are odd
            temp = number[lenght/2];
        }
        else
        {
             temp = (number[lenght/2-1] + number[lenght/2]) / 2;
        }

        System.out.println("median is : " + temp);

        
    }
}
