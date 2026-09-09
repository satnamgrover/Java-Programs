import java.util.*;

// class first
// {
//     int lenght;
//     int width;
//     first(int a,int b)
//     {
//         lenght=a;
//         width = b;
//     }
//     public void area()
//     {
//         System.out.println("area is : "  + lenght*width);
//     }
// }

class second 

{
    int lenght;
    int width;
    second(int a,int b)
    {
        lenght = a;
        width = b;
    }
    public void parameter()
    {
        System.out.println("parameter is : " + (2*(lenght+width)));
    }
}

class third extends second
{
    int hight;
    third(int a, int b, int c)
    {
        super(a,b);
        hight = c;
    }
    public void volume()
    {
        System.out.println("volume is : " + (lenght*width*hight));
    }
}
public class hieraricahl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter lenght : ");
        int a = sc.nextInt();
        System.out.println("enter width : ");
        int b = sc.nextInt();
        System.out.println("enter hight : ");
        int c = sc.nextInt();
        sc.close();
        
        second obj = new second(a, b);
        
        obj.parameter();

        third temp = new third(a, b, c);
        temp.volume();
    }
}
