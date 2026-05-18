import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i == n) {
            sum = sum + 1;
            i++;
        }
        System.out.println("Sum is" + sum);
        int avg = sum / n;
        System.out.println("Average" +avg);
    }
}
