public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {11, 23, 55, 7, 29, 11};

        int search = 23;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(search + " found at index " + index);
        }
        else {
            System.out.println(search + " not found anywhere.");
        }

        int insert = 6;
        int[] newArr = new int[arr.length + 1];
        int i = 0;
        while (i < arr.length && arr[i] < insert) {
            newArr[i] = arr[i];
            i++;
        }
        newArr[i] = insert;
        while (i < arr.length) {
            newArr[i + 1] = arr[i];
            i++;
        }
        arr = newArr;
        System.out.print("Array after insertion: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        int delete = 55;
        int[] newArr2 = new int[arr.length - 1];
        int j = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != delete) {
                newArr2[j] = arr[k];
                j++;
            }
        }
        arr = newArr2;
        System.out.print("Array after deletion: ");
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }
    }
}
