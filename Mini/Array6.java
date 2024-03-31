public class Mini {
    public static void countAndPrintEvenOdd(int[] arr, String type) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (type.equalsIgnoreCase("even")) {
            System.out.println("Even numbers count: " + evenCount);
        } else if (type.equalsIgnoreCase("odd")) {
            System.out.println("Odd numbers count: " + oddCount);
        } else {
            System.out.println("Invalid type provided. Please provide 'even' or 'odd'.");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        countAndPrintEvenOdd(array, "even");
        countAndPrintEvenOdd(array, "odd");
    }
}
