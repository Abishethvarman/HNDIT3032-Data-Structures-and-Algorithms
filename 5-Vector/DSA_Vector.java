import java.util.Vector;

public class DSA_Vector {
    public static void main(String[] args) {
        // 1. Create a Vector
        Vector<String> subjects = new Vector<>();
        System.out.println("Vector created: " + subjects);

        // 2. Add elements to the Vector
        subjects.add("DSA");
        subjects.add("OOP");
        subjects.add("SPT");
        subjects.add("OOAD");
        System.out.println("After adding elements: " + subjects);

        // 3. Get the size of the Vector
        System.out.println("Size of Vector: " + subjects.size());

        // 4. Access an element by index
        System.out.println("Element at index 2: " + subjects.get(2));

        // 5. Add an element at a specific index
        subjects.add(2, "AI");
        System.out.println("After adding 'AI' at index 2: " + subjects);

        // 6. Remove an element by index
        subjects.remove(1); // Remove element at index 1
        System.out.println("After removing element at index 1: " + subjects);

        // 7. Remove an element by value
        subjects.remove("SPT"); // Remove first occurrence of "SPT"
        System.out.println("After removing 'SPT': " + subjects);

        // 8. Check if an element exists
        boolean containsOOP = subjects.contains("OOP");
        System.out.println("Vector contains 'OOP': " + containsOOP);

        // 9. Find the index of an element
        int indexOfDSA = subjects.indexOf("DSA");
        System.out.println("Index of 'DSA': " + indexOfDSA);

        // 10. Modify an element
        subjects.set(1, "Software Engineering");
        System.out.println("After modifying index 1: " + subjects);

        // 11. Iterate using a for loop
        System.out.println("Iterating using for loop:");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("Element at index " + i + ": " + subjects.get(i));
        }

        // 12. Iterate using an enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        for (String subject : subjects) {
            System.out.println(subject);
        }

        // 13. Iterate using an Iterator
        java.util.Iterator<String> iterator = subjects.iterator();
        System.out.println("Iterating using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 14. Clear the Vector
        subjects.clear();
        System.out.println("Vector after clear: " + subjects);

        // 15. Check if Vector is empty
        boolean isEmpty = subjects.isEmpty();
        System.out.println("Is Vector empty? " + isEmpty);

        // 16. Add all elements from another collection
        subjects.add("Mathematics");
        subjects.add("Physics");
        Vector<String> newSubjects = new Vector<>();
        newSubjects.add("Chemistry");
        newSubjects.add("Biology");
        subjects.addAll(newSubjects);
        System.out.println("After adding all new subjects: " + subjects);

        // 17. Remove all elements from another collection
        subjects.removeAll(newSubjects);
        System.out.println("After removing newSubjects: " + subjects);

        // 18. Retain only the elements specified in another collection
        Vector<String> retainSubjects = new Vector<>();
        retainSubjects.add("Mathematics");
        subjects.retainAll(retainSubjects);
        System.out.println("After retaining Mathematics: " + subjects);

        // 19. Get the first element
        subjects.add("CS101");
        System.out.println("First element: " + subjects.firstElement());

        // 20. Get the last element
        subjects.add("CS102");
        System.out.println("Last element: " + subjects.lastElement());
    }
}
