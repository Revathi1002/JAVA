import java.util.Scanner;

public class maxmin_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        int max = number[0];
        for(int i = 0; i<n; i++)
        {
            if (number[i]>max)
            {
                max = number[i];
                }
            }
            System.out.println("max element is " + max);
        }
    }
