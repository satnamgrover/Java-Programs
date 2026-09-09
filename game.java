import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        int a = (int) (3 * Math.random());

        Scanner sc = new Scanner(System.in);

        String[] choice = { "rock", "paper", "scissor" };

        System.out.print("enter your chioce : ");
        String user = sc.nextLine();
        sc.close();

        String comchoice = choice[a];
        System.out.println("computer choice is : " + comchoice);

        if (user.equalsIgnoreCase(comchoice)) {
            System.out.println("it's tie");
        }

        else if (user.equalsIgnoreCase("rock") && comchoice.equals("scissor") ||
                user.equalsIgnoreCase("paper") && comchoice.equals("rock") ||
                user.equalsIgnoreCase("scissor") && comchoice.equals("paper")) {
            System.out.println("you wins ! ");
        } else {
            System.out.println("computer wins !");
        }

    }
}
