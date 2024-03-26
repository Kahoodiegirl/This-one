    import java.util.Scanner;

public class  Duplicate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Allow user to enter up to 25 values
        System.out.println("Enter up to 25 values (enter -1 to stop):");
        int[] values = new int[25];
        int count = 0;
        int value;
        
        while (count < 25) {
            System.out.print("Enter value #" + (count + 1) + ": ");
            value = scanner.nextInt();
            
            if (value == -1) {
                break; // Stop entering values if -1 is entered
            }
            
            values[count] = value;
            count++;
        }
        
        // Check for duplicates
        boolean hasDuplicates = false;
        int firstDuplicate = -1;
        int[] duplicatesCount = new int[25];
        
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (values[i] == values[j]) {
                    hasDuplicates = true;
                    if (firstDuplicate == -1) {
                        firstDuplicate = values[i];
                    }
                    duplicatesCount[values[i]]++;
                }
            }
        }
        
        // Output results
        if (hasDuplicates) {
            System.out.println("Duplicates found!");
            System.out.println("First duplicated value: " + firstDuplicate);
            
            // Extension: Display how many times each value was duplicated
            System.out.println("Duplicate counts:");
            for (int i = 0; i < duplicatesCount.length; i++) {
                if (duplicatesCount[i] > 0) {
                    System.out.println(i + ": " + duplicatesCount[i] + " times");
                }
            }
        } else {
            System.out.println("No duplicates found.");
        }
        
        scanner.close();
    }
}
