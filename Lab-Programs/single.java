import java.util.*;

class parent {
    public void area(int a, int b)
    {
        System.out.println("area is : " + (a*b));
    }
}

class child extends parent {
    public  void parameter(int a, int b)
    {
        System.out.println("pariemter is :" + (2*(a+b)));
    }
}

public class single {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter lenght of rectangle : ");
        int a = sc.nextInt();

        System.out.println("enter width of rectangle : ");
        int b = sc.nextInt();

        child temp = new child();

        temp.area(a,b);
        temp.parameter(a, b);
        sc.close();
    }
}