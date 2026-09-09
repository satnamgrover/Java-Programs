import java.util.*;
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("how many terms you wanted :");
        n = sc.nextInt();
        sc.close();

        int firstterm = 0;
        int secondterm = 1;

        for(i=1; i<=n; ++i)
        {
            System.out.print(firstterm + " ");
            int nextterm = firstterm + secondterm;

            firstterm = secondterm;
            secondterm = nextterm;
        }
        
    }
}
