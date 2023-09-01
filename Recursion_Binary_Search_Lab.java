// start

/**
 * @author Nicole
 * CIS 256
 * Professor Calle
 * Sep. 01, 2023
 * 
 * */
import java.util.*;

public class RecursionBinarySearchLab {

	/**
	 * Main method to execute binary search.
	 * 
	 * @param args standard
	 */

	public static void main(String[] args) {

		String[] names = { "Alice", "Bob", "Catherine", "David", "Eva", "Frank", "Grace", "Henry", "Irene", "Jack",
				"Karen", "Luke", "Mary", "Nathan", "Olivia", "Paul", "Quincy", "Rachel", "Samuel", "Tina", "Ulysses",
				"Victoria", "William", "Xander", "Yasmine", "Zachary", "Anna", "Benjamin", "Claire", "Daniel", "Emily",
				"Fiona", "George", "Hannah", "Isaac", "Julia", "Kevin", "Lily", "Michael", "Nora", "Oscar", "Penelope",
				"Quinn", "Ryan", "Sophia", "Thomas", "Uma", "Vincent", "Wendy", "Xavier", "Yara", "Zane", "NAME" };

		Arrays.sort(names);

		System.out.println("----- RECURSIVE BINARY SEARCH -----");
		System.out.println();

		System.out.println("The names in the list: ");

		for (int i = 0; i < names.length; i++) {
			System.out.println((names)[i] + " ");
			names[i] = names[i].toLowerCase();
		}
		System.out.println();

		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter an name to search for: ");
		String key = scnr.next().toLowerCase();

		int result = binarySearch(names, key);

		if (result == -1){
			System.out.println("Element not present.");
		}
		else{
			System.out.println("Element found at " + result + " index.");
		}
		scnr.close();
	}

	/**
	 * Helper method to perform binary search with four parameters
	 * 
	 * @param arr  list of elements to be searched
	 * @param word element to determine a match
	 * @return element
	 */

	public static int binarySearch(String[] arr, String word) {

		return binarySearch(arr, word, 0, arr.length - 1);
	}

	/**
	 * Method to perform recursion
	 * 
	 * @param arr   list of elements to search
	 * @param word  element to match
	 * @param left  smallest value for index
	 * @param right largest value for index
	 * @return element
	 */

	public static int binarySearch(String[] arr, String word, int left, int right) {


		if (left == right && !arr[left].equalsIgnoreCase(word)) {
			return -1;
		} else if (left == right && !arr[right].equalsIgnoreCase(word)) {
			return -1;
		}

		// Calculating middle point
		int middle = left + (right - left) / 2;

		int result = word.compareTo(arr[middle]);

		// Check if word is present at mid-point
		if (result == 0) {
			return middle;
		}

		// x on right side with subsearch from middle to right indexes.
		else if (result > 0) {
			return binarySearch(arr, word, middle + 1, right);
		}

		// x on left side with subsearch from left to middle indexes.
		else {
			return binarySearch(arr, word, left, middle - 1);
		}

	}

}

// end

