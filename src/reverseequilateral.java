import java.util.Scanner;

public class reverseequilateral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=2;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

