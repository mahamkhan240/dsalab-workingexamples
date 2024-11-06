public class swapIntegers {


    int a, b;

    public swapIntegers(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public void swap() {

        a = a + b;
        b = a - b;
        a = a - b;
    }


    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {

        swapIntegers obj = new swapIntegers(5, 8);


        System.out.println("Before swapping:");
        obj.display();


        obj.swap();


        System.out.println("After swapping:");
        obj.display();
    }
}
