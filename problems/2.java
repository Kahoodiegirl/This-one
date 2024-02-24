import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Simple Calculator!");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Select operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        
        switch (operation) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Cannot divide by zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
