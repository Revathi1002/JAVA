import java.util.Scanner;

public class keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase alpha");
        char p = sc.next().charAt(0);
        if (p >= 'a' && p <= 'z') {
            System.out.println("lowercase alpha");
        } else if (p >= 'A' && p <= 'Z') {
            System.out.println("uppercase alpha");
        } else if (p >= '0' && p <= '9') {
            System.out.println("number");
        } else {
            System.out.println("special character");
        }
        sc.close();
    }
}


