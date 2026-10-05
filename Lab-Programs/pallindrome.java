import java.util.*;
public class pallindrome {
    public static void main(String [] args)
    {
        System.out.println("enter an number :");
        Scanner sc = new Scanner(System.in);
        int number;
       
        number = sc.nextInt();
        
        
        sc.close();
        int n= number;
        int reverse = 0;

        while( n>0)
        {
        int remender = n%10;
        reverse = reverse * 10 + remender;
        n /=10;

        }
        if (number == reverse)
        {
            System.out.println ( "yes, "+number +" is a pallindrome number ! ");
        }
        else{
            System.out.println( "no, "+number + " is not a pallindrome number !");
        }
    }
    
}
