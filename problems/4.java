import java.util.Random;
import java.util.Scanner;

public class problems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Coin Flipper!");

        while (true) {
            System.out.println("Press enter to flip the coin (or type 'exit' to quit):");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Thanks for flipping! Goodbye!");
                break;
            }

            int randomNumber = random.nextInt(2); // Generates either 0 or 1
            String result = (randomNumber == 0) ? "Heads" : "Tails";
            System.out.println("The coin shows: " + result);
        }

        scanner.close();
    }
}
