public class ReverseArray {


    public static void reverse(int[] array) {
        int a = 0;
        int b = array.length - 1;

        while (a< b) {

            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;


a++;
            b--;
        }
    }


    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {77,88,99,33,66};
        System.out.println("before reversing:");
        display(array);

        reverse(array);
        System.out.println("After reversing");
        display(array);
    }
}
