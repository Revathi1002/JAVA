import java.util.Scanner;

public class dupicatearray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++)
        {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j =i+1; j < n; j++)

            {
                if(number[i]==number[j])
                {
                    System.out.println("duplicate is "+number[i]);
                }
            }
        }
    }
}
