import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            System.out.println("sum=sum+1");
            i++;
        }
        System.out.println("Sum" +sum);


    }
}
