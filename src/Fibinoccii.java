import java.util.Scanner;

public class Fibinoccii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int a=0;
        int b=1;
        int i=1;
        do {
            System.out.println(a+ " ");
            int next = a+b;
            a=b;
            b=next;
            i++;
        }
        while (i <= n);
    }
}
