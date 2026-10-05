import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        char operator;
        double result;
        System.out.println("etner first number:");
        a = sc.nextInt();
        System.out.println("enter any operator(+,-,*,/)");
        operator = sc.next().charAt(0);
        System.out.println("enter second number:");
        b = sc.nextInt();
        sc.close();

        switch(operator){
            case '+':
            result = a + b;
            break;

            case '-':
            result = a - b;
            break;

            case '*':
            result = a * b;
            break;
            case '/':
            if (b != 0){
                result = a / b;

            }else{
                System.out.println("error");
                return;
            }
            break;

        default:
            System.out.println("invalid operator");
            return;
            
        }
        System.out.println("Result :" +result);
        

    }
}