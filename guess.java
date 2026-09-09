import java.util.*;
public class guess {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int secretnumber =  1+(int) (100*Math.random());
        int maxattemp = 7, attemp = 0;
        

        System.out.println("welcome in the number guess game");
        System.out.println("the secret number is lies in between 1 to 100");
        System.out.println("you have " +maxattemp + " chance to guess the number");
        while(attemp<maxattemp){
            System.out.println("guess the number:");
            int userguess = sc.nextInt();
        
            if (userguess == secretnumber){
                System.out.println("congress ! you won the game");
                break;
            }
            else{
                if(userguess < secretnumber) {
                 System.out.println("too low");
             }
             else{
                 System.out.println("too high");
             }
            }
            attemp++;
        }
        if(attemp==maxattemp){
            System.out.println("you lose!");
            System.out.println("the secret number is:"+secretnumber);
        }
        sc.close();



    }
}
