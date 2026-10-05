import java.util.*;

class temp
{
     void add(float x, float y)
    {
        System.out.println("the sum is : "  +(x+y));
    }
     void div( double a, double b)
    {
        System.out.println("the Division is : " + (a/b));
    }
}

public class method
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.print("enter first number : ");
        a = sc.nextFloat();
        System.out.print("enter second number : ");
        b = sc.nextFloat();
        sc.close();

        temp obj = new temp();
        temp cal = new temp();

        obj.add(a,b);
        cal.div(a,b);

    }
}
