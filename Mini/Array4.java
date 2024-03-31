public class Mini {
    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int min = arr[0]; 
        
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 5};
        int min = findMin(array);
        System.out.println("Minimum element in the array: " + min);
    }
}
