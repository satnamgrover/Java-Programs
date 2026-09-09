import java.util.*;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("total elements : ");
        int n = sc.nextInt();

        System.out.println("array elements :");
        int user[] = new int[n];
        for(int i=0; i<n; i++)
        {
            user[i] = sc.nextInt();
        }
        System.out.println("target :");
        int target = sc.nextInt();
        sc.close();

        // to search an element we use for loop

        for(int i=0; i<n; i++)
        {
            if(user[i] == target)
            {
                System.out.println(i);
            }
        }
    }
}
