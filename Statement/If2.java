import java.util.Scanner;

public class Main{

public static void main(String[]args)
{
Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();

if (number < 10) {
    System.out.println("You are a kid");
}

if (number > 15 && number < 19){
    System.out.println("you are a teanager");
}

if (number > 21 && number < 50){
    System.out.println("you are an adult");
}

else;
    if (number > 60 && number < 80){
        System.out.println("you are old");
    }
    
}
}