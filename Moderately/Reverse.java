public class Moderately {
    public static String reverseString(String input) {
        
        char[] charArray = input.toCharArray();
        
        
        int left = 0;
        int right = charArray.length - 1;
        
        
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
       
        String reversedString = new String(charArray);
        
        return reversedString;
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
