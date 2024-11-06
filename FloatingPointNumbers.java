public class FloatingPointNumbers {

    public static void main(String[] args) {

        double a = 20.3296;
        double b = 20.329;


        int inta = (int) (a * 1000);
        int  intb= (int) (b * 1000);


        if (inta == intb) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different up to three decimal places.");
        }
    }
}
