import java.util.Scanner;

public class LinearSearch {
    // Declare the names array as a global variable
    static String[] names = {
        "Alice", "Bob", "Catherine", "David", "Eva", "Frank", "Grace", "Henry", "Irene", "Jack", "Karen", "Luke",
        "Mary", "Nathan", "Olivia", "Paul", "Quincy", "Rachel", "Samuel", "Tina", "Ulysses", "Victoria", "William",
        "Xander", "Yasmine", "Zachary",
        "Anna", "Benjamin", "Claire", "Daniel", "Emily", "Fiona", "George", "Hannah", "Isaac", "Julia", "Kevin", "Lily",
        "Michael", "Nora", "Oscar", "Penelope", "Quinn", "Ryan", "Sophia", "Thomas", "Uma", "Vincent", "Wendy", "Xavier",
        "Yara", "Zane", "name"
    };

    public static int caseInsensitiveSearch(String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                return i; // Return the index if the target name is found (case-insensitive)
            }
        }
        return -1; // Return -1 if the target name is not found
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the target name: ");
        String target = scnr.nextLine();

        long startTime = System.nanoTime(); // Record the start time

        int index = caseInsensitiveSearch(target);

        long endTime = System.nanoTime(); // Record the end time
        double durationSeconds = (endTime - startTime) / 1e9; // Calculate the time taken in seconds

        if (index != -1) {
            System.out.printf("Found '%s' at index %d.\n", names[index], index);
        } else {
            System.out.printf("'%s' not found in the list.\n", target);
        }

        System.out.printf("Time taken: %.6f seconds (O(n) complexity)\n", durationSeconds);
        scnr.close();
    }
}
