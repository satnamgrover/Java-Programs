import java.util.Scanner;
public class greatest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter first number:");
        a = sc.nextInt();
        System.out.println("enter second number:");
        b = sc.nextInt();
        System.out.println("enter third number:");
        c = sc.nextInt();

        if (a>b){
            if (a>c){
                System.out.println("a is grestest");
            }
            else{
                System.out.println("c is grestest");
            }
        }
        
        else{
            if (b>c){
                System.out.println("b is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
    sc.close();
        
    }
    
}
