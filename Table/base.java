import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the multiplication table (from -5 to 5): ");
        int size = scanner.nextInt();

       
        int[][] table = new int[size * 2 + 1][size * 2 + 1];

       
        for (int i = -size; i <= size; i++) {
            for (int j = -size; j <= size; j++) {
                table[i + size][j + size] = i * j;
            }
        }

       
        System.out.println("Multiplication Table:");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
