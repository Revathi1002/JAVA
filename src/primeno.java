import javax.swing.*;
import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(); //10
        boolean temp = true;
        if (n < 2)
        {
            temp = false;
        }
        else
        {
            for (int i = 2; i<n; i++)
            {
                if(n % i == 0)
                {
                    temp = false;
                    break;
                }

            }

        }
        if (temp) {
            System.out.println(n+ "is a prime number");
        } else {
            System.out.println(n+ "not a prime number");
        }
    }
}




