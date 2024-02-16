import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a single letter: ");
        String input = scanner.nextLine();
        
      
        char letter = Character.toLowerCase(input.charAt(0));
        
        
        if (input.length() == 1 && Character.isLetter(letter)) {
            
            if (isVowel(letter)) {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        } else {
            System.out.println("Please enter a single letter.");
        }
        
       
        scanner.close();
    }
    
    
    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}
