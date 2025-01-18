import java.util.Scanner;

public class ArraySearch {

    // Function to search for ITEM and display neighbors
    public static void search(int[] LA, int ITEM) {
        // Flag to track if ITEM exists in the array
        boolean found = false;

        // Loop through the array to search for ITEM
        for (int i = 0; i < LA.length; i++) {
            if (LA[i] == ITEM) {
                found = true;
                System.out.println("ITEM " + ITEM + " found at index " + i);

                // Check for two right neighbors
                if (i + 1 < LA.length) {
                    System.out.println("Right neighbor 1: " + LA[i + 1]);
                    if (i + 2 < LA.length) {
                        System.out.println("Right neighbor 2: " + LA[i + 2]);
                    } else {
                        System.out.println("No right neighbor 2");
                    }
                } else {
                    System.out.println("No right neighbor");
                }

                // Check for two left neighbors
                if (i - 1 >= 0) {
                    System.out.println("Left neighbor 1: " + LA[i - 1]);
                    if (i - 2 >= 0) {
                        System.out.println("Left neighbor 2: " + LA[i - 2]);
                    } else {
                        System.out.println("No left neighbor 2");
                    }
                } else {
                    System.out.println("No left neighbor");
                }

                break; // Exit the loop once the item is found
            }
        }

        // If the item was not found in the array
        if (!found) {
            System.out.println("ITEM " + ITEM + " not found in the array.");
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

        // Taking input for the ITEM to search
        System.out.println("Enter the ITEM to search:");
        int ITEM = sc.nextInt();

        // Perform the search operation
        search(LA, ITEM);

        sc.close();
    }
}
