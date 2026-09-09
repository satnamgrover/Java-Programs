import java.util.*;

class area
{
    void abc(double a)
    {
        
        System.out.println("area is : " + (a*a));

    }
}
public class classs

{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of square : ");
        double g = sc.nextDouble();
        sc.close();
        area obj = new area();
        obj.abc(g);

    }
}