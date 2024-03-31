public class Mini {
    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int max = arr[0]; 
        
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 5};
        int max = findMax(array);
        System.out.println("Maximum element in the array: " + max);
    }
}
