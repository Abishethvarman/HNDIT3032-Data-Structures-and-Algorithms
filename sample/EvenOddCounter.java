public class EvenOddCounter {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 5};
        
        // Initialize counters
        int evenCount = 0, oddCount = 0;

        // Loop through the array
        for (int num : array) {
            if (num % 2 == 0) {  // Check if the number is even
                evenCount++;
            } else {  // Otherwise, it's odd
                oddCount++;
            }
        }

        // Output the results
        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);
    }
}
