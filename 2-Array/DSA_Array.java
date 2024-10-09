public class DSA_Array {
    public static void main(String[] args) {
        // 1. Array Declaration and Initialization
        int[] numbers = {1, 2, 3, 4, 5};
        String[] subjects = new String[4]; // Declare an array with a fixed size

        // 2. Assign values to the array
        subjects[0] = "DSA";
        subjects[1] = "OOP";
        subjects[2] = "SPT";
        subjects[3] = "OOAD";

        // 3. Print the Size of the Array
        System.out.println("Size of numbers array: " + numbers.length);
        System.out.println("Size of subjects array: " + subjects.length);

        // 4. Accessing Elements by Index
        System.out.println("Element at index 2 in numbers: " + numbers[2]);

        // 5. Modifying an Element
        numbers[3] = 10; // Changing value at index 3
        System.out.println("Updated numbers array: " + java.util.Arrays.toString(numbers));

        // 6. Iterating Through the Array Using a For Loop
        System.out.println("Iterating using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 7. Iterating Using an Enhanced For Loop
        System.out.println("Iterating using an enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 8. Finding the Minimum and Maximum Values
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        // 9. Searching for an Element (Linear Search)
        int searchValue = 3;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + searchValue + ": " + index);

        // 10. Copying an Array
        int[] copiedArray = new int[numbers.length];
        System.arraycopy(numbers, 0, copiedArray, 0, numbers.length);
        System.out.println("Copied array: " + java.util.Arrays.toString(copiedArray));

        // 11. Sorting an Array
        java.util.Arrays.sort(numbers);
        System.out.println("Sorted numbers array: " + java.util.Arrays.toString(numbers));

        // 12. Reversing an Array
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversedArray));

        // 13. Checking if an Array Contains a Value
        boolean containsValue = false;
        for (int num : numbers) {
            if (num == 2) {
                containsValue = true;
                break;
            }
        }
        System.out.println("Array contains 2: " + containsValue);

        // 14. Merging Two Arrays
        int[] newNumbers = {6, 7, 8};
        int[] mergedArray = new int[numbers.length + newNumbers.length];
        System.arraycopy(numbers, 0, mergedArray, 0, numbers.length);
        System.arraycopy(newNumbers, 0, mergedArray, numbers.length, newNumbers.length);
        System.out.println("Merged array: " + java.util.Arrays.toString(mergedArray));

        // 15. Getting the Length of the Array
        System.out.println("Length of merged array: " + mergedArray.length);

        // 16. Clearing an Array (Setting All Values to Zero)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }
        System.out.println("Cleared numbers array: " + java.util.Arrays.toString(numbers));

        // 17. Converting an Array to a String
        String subjectsString = java.util.Arrays.toString(subjects);
        System.out.println("Subjects array as string: " + subjectsString);

        // 18. Filling an Array with a Specific Value
        int[] filledArray = new int[5];
        java.util.Arrays.fill(filledArray, 42);
        System.out.println("Filled array: " + java.util.Arrays.toString(filledArray));

        // 19. Finding the Index of a Specific Value
        int specificValue = 10;
        int specificIndex = java.util.Arrays.binarySearch(numbers, specificValue);
        System.out.println("Index of " + specificValue + " in numbers array: " + specificIndex);

        // 20. Creating a Multidimensional Array
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Multidimensional array: " + java.util.Arrays.deepToString(multiArray));
    }
}
