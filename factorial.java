import java.util.*;
public class factorial {
    public static void main(String[] args){
        int i;
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an number : ");
        int a = sc.nextInt();
        sc.close();
        for(i=1; i<=a; i++)
        {
            fact = fact * i;
            
        }

        if(a==0 || a==1)
        {
            System.out.println("Fatorial is : 1");
        }
        else{
      
        System.out.println("Factorial is : " +fact);
    }
        
    }

    

    }
    

