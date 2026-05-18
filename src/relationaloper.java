import java.util.Scanner;

public class relationaloper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a and b value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("equal" + (a == b));
        System.out.println("not equal" + (a != b));
        System.out.println("lesser than" + (a <= b));
        System.out.println("greater than" + (a >= b));
        System.out.println("greater or equal" + (a >= b));
        System.out.println("++increment" + (a <= b));

    }
}
