import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int die1, die2, die3, dieRoll;
        int rollCount = 1;
        final String ROLL = "Roll";
        final String DIE1 = "Die1";
        final String DIE2 = "Die2";
        final String DIE3 = "Die3";
        final String SUM = "Sum";
        String playAgain = "";
        String trash = "";
        boolean repeat = false;
        boolean done = false;
        System.out.printf("%6s %6s %6s %6s %6s\n\n", ROLL, DIE1, DIE2, DIE3, SUM);
        do {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            dieRoll = die1 + die2 + die3;
            while (die1 != die3 || die2 != die3) {
                System.out.printf("%6d %6d %6d %6d %6d\n", rollCount, die1, die2, die3, dieRoll);
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                dieRoll = die1 + die2 + die3;
                rollCount ++;
            }
            do {
                System.out.print("Do you want to continue throwing dice? [Y/N] ");
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
                }
            } while(!done && repeat);
        } while(!done);
    }
}