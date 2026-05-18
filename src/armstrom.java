import javax.swing.*;
import java.util.Scanner;

public class armstrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum = sum + (d * d * d );
            n = n / 10;
        }
        if(temp == sum)
        {
            System.out.println("is armstrong");
        }
        else
        {
            System.out.println("is not armstrong");
        }
    }
}

