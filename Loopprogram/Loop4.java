import java.util.Scanner;

public class Loopprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        char choice;

        
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            
            if (number > largest) {
                largest = number;
            }

           
            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Do you want to continue? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}
