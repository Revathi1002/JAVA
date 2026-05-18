import java.util.Scanner;
class bankk {
    int balance=1000;
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + "amount deposit");
        System.out.println("total balance is" + balance);
    }
    public void withdraw(int amount)
    {
        if(amount<=balance)
        {
             balance = balance - amount;
            System.out.println(amount + "amount withdraw");
            System.out.println("total balance is" + balance);
        }
    else
    {
        System.out.println("insufficient amount");
    }
}
}

public class account1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a amount to deposit");
        int a = sc.nextInt();
        bank obj = new bank();
        obj.deposit(a);

        System.out.println("Enter a amount withdraw");
        int b = sc.nextInt();
        bank obj1 = new bank();

    }
}






