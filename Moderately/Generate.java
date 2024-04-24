public class Moderately {
    
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        
        System.out.println("First " + n + " terms of Fibonacci series:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
    
    
    public static void main(String[] args) {
        int n = 10; // Change the value of n as needed
        
        printFibonacci(n);
    }
}
