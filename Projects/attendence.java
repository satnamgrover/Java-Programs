import java.util.*;

public class attendence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("college req (60%,70%,80%) :");
        String req = sc.nextLine();
        System.out.println("Total lectures :");
        int a = sc.nextInt();
        System.out.println("how much you attend :");
        int b = sc.nextInt();

        double result = (b*100)/a;

        switch(req)
        {
            case "60%":
            if (result>=60)
            {   
                double temp = result - 60;
                double calculate = (temp/100)*a;
                System.out.println("you have " + result +"%"+  " attendence ,"+ " so you can bunk " + calculate + " lectures");
            }
            else
            {
                double temp = 60 - result;
                double calculate = (temp/100)*a;
                System.out.println("your " +calculate + "  lectures are short !");
            }
            break;
            
            case "70%":
            if (result>=70)
            {
                double temp = result - 70;
                double calculate = (temp/100)*a;
                System.out.println("you have " + result +"%"+  " attendence ,"+ " so you can bunk " + calculate + " lectures");

            }
            else
            {
                double temp = 60 - result;
                double calculate = (temp/100)*a;
                System.out.println("your " + calculate +" lectures are short");
            }
            break;

            case "80%":
            if (result>=80)
            {
                double temp = result - 80;
                double calculate = (temp/100)*a;
                System.out.println("you have " + result +"%"+  " attendence ,"+ " so you can bunk " + calculate + " lectures");
                
            }
            else
            {
                double temp = 80 - result;
                double calculate = (temp/100)*a;
                System.out.println("your " + calculate + " lectures are short !");
            }
            break;
            default:
            System.out.println("please enter valid requirement !");
        }
        sc.close();

    }
}
