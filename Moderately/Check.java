public class Moderately {
   
    public static boolean isPrime(int num) {
     
        if (num <= 1) {
            return false;
        }
        
       
        for (int i = 2; i * i <= num; i++) {
            
            if (num % i == 0) {
                return false;
            }
        }
        
        
        return true;
    }
    
   
    public static void main(String[] args) {
        int num = 17; 
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
