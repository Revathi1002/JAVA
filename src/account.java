import java.util.Scanner;

class bank
{
    int balance=1000;
    public void deposit(int amount)
    {
        balance=balance+amount;
        System.out.println(amount +"Enter a amount depositing");
        System.out.println(balance +"total amount ");
    }
}
    public class account {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a amount");
        int a=sc.nextInt();
        bank obj=new bank();
        obj.deposit(a);

    }
}
