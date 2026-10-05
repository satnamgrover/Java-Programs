import java.util.*;

public class mean
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements : ");
        int n = sc.nextInt();
        double[] number = new double[n];
        double[] fre = new double[n];
        double[] fx = new double[n];
        double sum = 0, nm=0;
        int i;
        System.out.println("enter x series : ");
        for(i=0; i<n; i++)
        {
            number[i] = sc.nextDouble();
        }
        

        System.out.println("enter f series : ");
        for(i=0; i<n; i++)
        {
            fre[i] = sc.nextDouble();
            
            nm += fre[i];
            sum += fx[i];
        }
        
        double mean = sum/nm;
        
        System.out.println("mean is : " + mean);
        
        
    }
    
}
