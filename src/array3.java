import java.util.Scanner;

public class array3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[]number=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            number[i]=sc.nextInt();
        }
        int even=0; int odd=0;
        for(int i=0;i<n;i++)
        {
            if(number[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }

        }
        System.out.println("even :"+even);
        System.out.println("odd :"+odd);

    }
}
