Class Scanner

public class Main {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        double time = 2;
        
        double interest = SimpleInterestCalculator.calculateSimpleInterest(principal, rate, time);
        double totalAmount = principal + interest;
        
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Interest: $" + interest);
        System.out.println("Total Amount: $" + totalAmount);
    }
}

