public class labTask1 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }


            System.out.println();
        }
    }
}