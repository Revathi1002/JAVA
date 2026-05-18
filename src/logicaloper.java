import java.util.Scanner;

public class logicaloper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a and b value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a < b && a == 0);
        System.out.println(a != b || a == 4);
        System.out.println(a > b && a == 0);
    }

    }
