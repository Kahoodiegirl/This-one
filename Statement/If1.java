import java.util.Scanner;
public class Main{

  public static void main(String[]args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();
    
    if (number % 2 ==0){
        System.out.println("The nuber is even");
    }

    if (number % 2 ==1){
        System.out.println("The number is odd");
    }

    scanner.close();
  }

}