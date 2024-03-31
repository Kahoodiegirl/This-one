import java.util.Arrays;

public class Mini {
    public static int[] removeDuplicates(int[] arr) {
       
        Arrays.sort(arr);
        
        int[] result = new int[arr.length];
        int previous = arr[0];
        result[0] = previous;

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (previous != current) {
                result[i] = current;
                previous = current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7};
        
        
        int[] result = removeDuplicates(array);

      
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }
}
