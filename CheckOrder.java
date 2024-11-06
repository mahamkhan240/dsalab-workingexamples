

import java.util.Scanner;
public class CheckOrder {
    public static void CheckOrder(int a,int b,int c){
        if(a<b&&b<c){
            System.out.println("increasing order");
        } else if (c<b&&b<a) {
            System.out.println("decreasing order");
            
        }else {
            System.out.println("neither increasing nor decreasing");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1");
        int a=sc.nextInt();
        System.out.println("enter num 2");
        int b=sc.nextInt();
        System.out.println("enter num 3");
        int c=sc.nextInt();
CheckOrder(a,b,c);
        sc.close();
    }
}
