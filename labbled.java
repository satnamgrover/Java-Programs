import java.util.*;

public class labbled {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j,n;

        System.out.print("enter any number : ");
        n = sc.nextInt();
        
        
     outerloop :   for(i=1; i<=n; i++)
        {
        internalloop:  for(j=1; j<=n; j++)
            {   
              if(j==3)
              
                break internalloop;
              
              System.out.print("*");
            }
            if(i==3)
            
            continue outerloop;
            
            System.out.println();
    }
    
    
}
}