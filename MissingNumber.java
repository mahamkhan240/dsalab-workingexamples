public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;

        int totalSum = n * (n + 1) / 2;
        int Sum = 0;

        for (int num : arr) {
            Sum += num;
        }

        int missingNumber = totalSum - Sum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
