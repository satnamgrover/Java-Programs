import java.util.*;

public class grade {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b,c,d,e,temp;
        System.out.println("had you got out of :");
        int f  = sc.nextInt();
        System.out.print("enter your first subject marks : ");
        a = sc.nextInt();
        System.out.print("enter your second subject marks :");
        b = sc.nextInt();
        System.out.print("enter your third subject marks :");
        c = sc.nextInt();
        System.out.print("enter your fourth subject mraks :");
        d = sc.nextInt();
        System.out.println("enter yout fifth subject marks :");
        e = sc.nextInt();
        sc.close();

        temp = a + b + c + d + e ;
        double cal = (temp*100)/(f*5);
        System.out.println("your parcentage is :" + cal);
        
        if(cal >= 80)
        {
            if (cal >= 90)
            {
                if(cal>95)
                {
                    System.out.println("your grade is A+");
                    
                }
                else{
                    System.out.println("your grade is A");
                }
            }
            else {
                System.out.println("your grade is  B+");
            }


        }
        else{
            if(cal>=70)
            {
                System.out.println("your grade is B ");
            }
            else{
                System.out.println("your grade is C");
            }
        }
    }
}
