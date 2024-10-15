import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int rollNum = 1;

            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("------------------------------------");

            while (true) {

                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;

                int sum = die1 + die2 + die3;

                System.out.println(rollNum + "\t" + die1 + "\t" + die2 + "\t" + die3 + "\t" + sum);

                if (die1 == die2 && die2 == die3) {
                    System.out.println("You rolled a triple! Closing this round.");
                    break;
                }

                rollNum++;
            }

            System.out.println("\nDo you want to play again? (Y/N)");
            String userInput = scanner.nextLine().toUpperCase();
            playAgain = userInput.equals("Y");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
