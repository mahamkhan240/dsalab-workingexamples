public class MinimumValue {
    public static void main(String[] args) {
        int[] arr = {12, 13, 7, 29, 55};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The minimum value is: " + min);
    }
}
