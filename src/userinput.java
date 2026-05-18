import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=obj.nextLine();
        System.out.println("Enter the age");
        int age=obj.nextInt();
        System.out.println(name+" "+age);




    }
}
