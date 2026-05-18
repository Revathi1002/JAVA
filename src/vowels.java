import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char r = 'i';
        if (r == 'a' || r == 'e' || r == 'i' || r == 'u' || r == 'o' || r == 'p')
        {
            System.out.println("vowels");
        }
        else
        {
            System.out.println("consanants");
        }
    }
}