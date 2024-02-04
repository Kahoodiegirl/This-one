Class Problem4

{
    {
        import java.util.Scanner;

public class FavoriteColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        
        String lowerCaseColor = favoriteColor.toLowerCase();

        
        if (lowerCaseColor.equals("red")) {
            System.out.println("I like red too");
        } else {
            System.out.println("I don't like " + favoriteColor + " I prefer red.");
        }

        scanner.close(); 
    }
}

    }
}