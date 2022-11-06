import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addtion of matrix");
        int [][] a = new int [3][3];
        int [][] b = new int [3][3];
        int [][] c = new int [3][3];
        System.out.println("enter elements in the matrix a");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter elements in the matrix a");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addtion of matrix a and b is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               c[i][j] = a[i][j] + b[i][j] ;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(c[i][j] + "     ");
            }
            System.out.println();
        }
    }
}
