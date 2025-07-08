import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        Random rnd = new Random();
        int die1, die2, die3, dieRoll;
        int rollCount = 1;
        String playAgain = "";
        String trash = "";
        System.out.println("Roll Die1 Die2 Die3 Sum");
        do
        {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            while(die1 != die3 || die2 != die3)
            {
                dieRoll = die1 + die2 + die3;
                System.out.printf("%3d %3d %3d %3d %5d\n", rollCount, die1, die2, die3, dieRoll);
            }
            System.out.print("Do you want to run it again? [Y/N] ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y")) {
            done = false;
            repeat = false;
        } else if (playAgain.equalsIgnoreCase("N")) {
            System.out.println("Thanks for playing!");
            done = true;
            repeat = false;
        } else {
            trash = playAgain;
            System.out.println(trash + " is not a valid response.");
            done = false;
            repeat = true;
            done = true
        } while(!done);
    }
}