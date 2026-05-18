import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("enter the array elements");
        for(int i = 0; i<n; i++)
        {
            number[i] = sc.nextInt();
        }
        System.out.println("reverse of an array is :");
        for(int i=number.length-1;i>=0;i--)
        {
            System.out.println(number[i]+" ");
        }
    }
}
