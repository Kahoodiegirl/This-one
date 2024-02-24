import java.util.Random;
import java.util.Scanner;

public class Loopprogram {
    public static void main(String[] args) {
       
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        
        Scanner scanner = new Scanner(System.in);

        
        int guess;

        
        while (true) {
            
            System.out.print("Guess the number (between 1 and 100): ");
            guess = scanner.nextInt();

           
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break; 
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again."); // Guess is lower than the random number
            } else {
                System.out.println("Too high, try again."); // Guess is higher than the random number
            }
        }

        
        scanner.close();
    }
}
