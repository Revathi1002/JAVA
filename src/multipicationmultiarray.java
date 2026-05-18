import java.lang.constant.DynamicCallSiteDesc;
import java.util.Scanner;

public class multipicationmultiarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and col");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] d = new int[r][c];
        System.out.println("enter the elements of 1st matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of 2nd matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("multiplication of 2 matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    d[i][j] = d[i][j] + a[i][k] * b[k][j];
                }
            }
        }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {

                        System.out.print(d[i][j] + " ");
                }

                System.out.println();
            }
        }
    }
