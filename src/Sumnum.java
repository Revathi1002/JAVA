import java.util.Scanner;

public class Sumnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = 1;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        }
        while (i<= 100);


            System.out.println("Sum = " + sum);
        }

    }


