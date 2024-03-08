import java.util.Random;

public class Review {
    public static void main(String[] args) {
        
        int monsterHP = 100;

       
        Random random = new Random();

        
        while (monsterHP > 0) {
            
            int d20Roll = random.nextInt(20) + 1; 

           
            int damageDealt = calculateDamage(d20Roll);

            
            monsterHP -= damageDealt;

            
            if (monsterHP < 0) {
                monsterHP = 0;
            }

           
            System.out.println("You rolled a d20: " + d20Roll);
            System.out.println("Damage dealt: " + damageDealt);
            System.out.println("Monster's HP remaining: " + monsterHP);
            System.out.println();
        }

        System.out.println("The monster has been defeated!");
    }

    
    public static int calculateDamage(int d20Roll) {
        
        if (d20Roll == 20) {
            return 20; 
        } else {
            return 10; 
        }
    }
}
