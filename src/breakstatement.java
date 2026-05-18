import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while (i<=100)
        {
            if(i==98)
            {
                break;
            }
            System.out.println(i);
            i++;
        }

    }
}
