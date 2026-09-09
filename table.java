import java.util.Scanner;
public class table{
    public static void main(String args[]){
        Scanner java = new Scanner(System.in);
        int a ;
        System.out.println("enter any number:");
        a = java.nextInt();

        int i=1;
        do{
            System.out.println(a +"*" + i + "=" + (a*i));
            i++;
        }
        while(i<=10);
        java.close();
    }
    
}
