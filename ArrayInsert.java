import java.util.Scanner;

public class ArrayInsert {

    // Function to insert ITEM into the array at index K
    public static void insert(int[] LA, int K, int ITEM) {
        // Check if the index K is within the valid range
        if (K < 0 || K >= LA.length) {
            System.out.println("Error: Index K is out of range.");
            return;
        }

        // Check if the ITEM is a positive integer
        if (ITEM <= 0) {
            System.out.println("Error: ITEM must be a positive integer.");
            return;
        }

        // Check if the ITEM is less than the element at index K
        if (ITEM < LA[K]) {
            // Shift elements to the right to make space for the new ITEM
            for (int i = LA.length - 1; i > K; i--) {
                LA[i] = LA[i - 1];
            }
            // Insert ITEM at index K
            LA[K] = ITEM;
            System.out.println("ITEM " + ITEM + " inserted at index " + K);
        } else {
            // If ITEM is greater than or equal to the current element at index K
            System.out.println("ITEM " + ITEM + " at index " + K + " is greater than the user's entered ITEM.");
        }
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] LA = new int[size];

        // Taking input for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            LA[i] = sc.nextInt();
        }

        // Taking input for index K and ITEM
        System.out.println("Enter the index K:");
        int K = sc.nextInt();

        System.out.println("Enter the ITEM (positive integer):");
        int ITEM = sc.nextInt();

        // Perform the insert operation
        insert(LA, K, ITEM);

        // Print the updated array
        System.out.println("Updated array:");
        for (int i = 0; i < size; i++) {
            System.out.print(LA[i] + " ");
        }

        sc.close();
    }
}
