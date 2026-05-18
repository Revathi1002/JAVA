import java.util.Scanner;

public class reversename {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String str=sc.nextLine();
        String rev="";
        for(int i = str.length() - 1; i>=0; i--)
        {
            rev += str.charAt(i);
        }
        System.out.println("reverse is" +rev);

    }
}
