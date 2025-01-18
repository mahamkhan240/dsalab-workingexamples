public class ArrayImplementation
{
    private int[] array;
    private int size;


    public ArrayImplementation(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size < array.length) {
            array[size] = value;
            size++;
        }
        else {
            System.out.println("Array is full. ");
        }
    }


    public void edit(int index, int newValue) {
        if (index >= 0 && index < size) {
            array[index] = newValue;
        }
        else {
            System.out.println("Invalid index.");
        }
    }


    public void delete(int index) {
        if (index >= 0 && index < size) {

            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
        else {
            System.out.println("Invalid index.");
        }
    }


    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
        }
        else {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ArrayImplementation arr = new ArrayImplementation(5);
        arr.add(1);
        arr.add(22);
        arr.add(23);
        arr.add(50);
        arr.add(10);

        System.out.println("Array after additions:");
        arr.display();


        arr.add(60);


        arr.edit(2, 35);
        System.out.println("Array after editing element:");
        arr.display();


        arr.delete(1);
        System.out.println("Array after deleting element ");
        arr.display();


    }
}
