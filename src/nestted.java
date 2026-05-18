import java.util.Scanner;

public class nestted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c values :");
        int a = sc.nextInt(); //4
        int b = sc.nextInt(); //8
        int c = sc.nextInt(); //12
        if (a > b) {
            if (a > c) {
                System.out.println(a + "is largest");

            }
        } else {
            if (b > c) {
                System.out.println(b + "is largest");
            } else {
                if (c > a)
                    System.out.println(c + "is largest");
            }

        }
    }
}
