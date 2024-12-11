import java.util.Scanner;

public class DiagonalSum {
    public static int leftDiagonalSum(int[][]matrix,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
        }
        return sum;
    }
    public static int rightDiagonalSum(int[][]matrix,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=matrix[i][n-i-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of matrix(nxn)");
        int n= sc.nextInt();
        int [][] matrix=new int[n][n];
        System.out.println("enter elements of matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();

            }

        }
        int leftSum=leftDiagonalSum(matrix,n);
        int rightSum=rightDiagonalSum(matrix,n);
        System.out.println("left diagonal sum"+leftSum);
        System.out.println("right diagonal sum"+rightSum);
        sc.close();
    }
}
