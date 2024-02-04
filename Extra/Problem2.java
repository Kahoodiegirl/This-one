Class Problem2
import java.util.Scanner;
{
    public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

       
        if (number < 10) {
            System.out.println("Too low.");
        } else if (number >= 10 && number <= 20) {
            System.out.println("Correct.");
        } else {
            System.out.println("Too high.");
        }

        
        scanner.close();
    }
}
}