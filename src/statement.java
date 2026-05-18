import java.util.Scanner;

public class statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c='R';
        switch (c)
        {
            case 'R':
                System.out.println("stop") ;
                break;
            case 'Y':
                System.out.println("be ready");
                break;
            case 'G':
                System.out.println("go");
                break;
            default:
                System.out.println("Enter a valid color");
                break;

        }


    }
}
