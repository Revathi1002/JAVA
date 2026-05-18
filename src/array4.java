import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[]number = new int[n];
        int[]copy = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i<n; i++)
        {
            number[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            copy[i] = number[i];
        }
        System.out.println("original array :");
        for(int i=0;i<n;i++) {
            System.out.println(number[i] + " ");
        }
        System.out.println("copied array :");
        for(int i=0;i<n;i++) {
            System.out.println(copy[i] + " ");

        }
    }
}
