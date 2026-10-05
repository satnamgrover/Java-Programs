import java.util.*;
public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first,second,third,fourth,fifth,sixth;
        double temp;
        double cal;
        System.out.print("Total semester : ");
        int user = sc.nextInt();

        switch (user) {
            case 2:
                System.out.print("first semester percentage : ");
                first = sc.nextDouble();
                System.out.print("second semester percentage : ");
                second = sc.nextDouble();
                temp = first + second;
                cal = (temp/user)/9.5;
                System.out.print("yout cgpa is : " + cal);
                break;
            
            case 3:
                System.out.print("first semester percentage : ");
                first = sc.nextDouble();
                System.out.print("second semester percentage : ");
                second = sc.nextDouble();
                System.out.print("third semester percentage : ");
                third = sc.nextDouble();
                temp = first + second + third;
                cal = (temp/user)/9.5;
                System.out.print("yout cgpa is : " + cal);
                break;

            case 4:
                System.out.print("first semester percentage : ");
                first = sc.nextDouble();
                System.out.print("second semester percentage : ");
                second = sc.nextDouble();
                System.out.print("third semester percentage : ");
                third = sc.nextDouble();
                System.out.print("fourth semester percentage : ");
                fourth = sc.nextDouble();
                temp = first + second + third + fourth;
                cal = (temp/user)/9.5;
                System.out.print("yout cgpa is : " + cal);
                break;
            
            case 5:
                System.out.print("first semester percentage : ");
                first = sc.nextDouble();
                System.out.print("second semester percentage : ");
                second = sc.nextDouble();
                System.out.print("third semester percentage : ");
                third = sc.nextDouble();
                System.out.print("fourth semester percentage : ");
                fourth = sc.nextDouble();
                System.out.print("fifth semester percentage : ");
                fifth = sc.nextDouble();
                temp = first + second + third + fourth + fifth;
                cal = (temp/user)/9.5;
                System.out.print("yout cgpa is : " + cal);
                break;

            case 6:
                System.out.print("first semester percentage : ");
                first = sc.nextDouble();
                System.out.print("second semester percentage : ");
                second = sc.nextDouble();
                System.out.print("third semester percentage : ");
                third = sc.nextDouble();
                System.out.print("fourth semester percentage : ");
                fourth = sc.nextDouble();
                System.out.print("fifth semester percentage : ");
                fifth = sc.nextDouble();
                System.out.print("sixth semester percentge : ");
                sixth = sc.nextDouble();
                temp = first + second + third + fourth + fifth + sixth;
                cal = (temp/user)/9.5;
                System.out.print("yout cgpa is : " + cal);
                break;

        }
        sc.close();
    }
}
