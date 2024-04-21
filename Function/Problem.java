public class Function {

   
    public static double subtract(double a, double b) {
        return a - b;
    }

    
    public static double multiply(double a, double b) {
        return a * b;
    }

    
    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }

   
    public static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        double result1 = subtract(10, 5);
        double result2 = multiply(3, 4);
        double result3 = add(1, 2, 3);
        System.out.println("Result of subtraction: " + result1);
        System.out.println("Result of multiplication: " + result2);
        System.out.println("Result of addition: " + result3);

        greetUser();

        int numStars = 5;
        System.out.println("Printing " + numStars + " stars:");
        printStars(numStars);
    }
}
