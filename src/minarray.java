import java.util.Scanner;

public class minarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("enter the array elements");
        for(int i = 0; i < n; i++)
        {
            number[i] = sc.nextInt();
        }
        int min = number[0];
        for(int i = 0; i<n; i++)
        {
            if (number[i]<min)
            {
                min = number[i];
            }
        }
        System.out.println("min element is " + min);
    }
}

