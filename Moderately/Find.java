public class Moderately {
    
    public static int findLargestElement(int[] arr) {
        
        if (arr == null || arr.length == 0) {
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
        int[] array = {10, 5, 7, 20, 15}; 
        
        int largestElement = findLargestElement(array);
        System.out.println("The largest element in the array is: " + largestElement);
    }
}
