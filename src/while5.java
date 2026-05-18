import java.util.Scanner;

public class while5 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       int rev = 0;
       int temp=n;
       while (n != 0) {
           int m = n % 10;
           rev = rev*10 + m;
           n=n/10;
       }
       if(temp==rev)
       {
           System.out.println("palindrome");

       }
       else
       {
           System.out.println("not a palindrome");

       }

    }
}
