import java.util.Scanner;
class phone
{
    int battery=10;
    public void phonedetails(String name, String color, String ram, String rom)
    {
        System.out.println(name+ " " +color+" " +ram+" " +rom+" ");
}
public void message()
{
    if(battery<20)
    {
        System.out.println("low battery please charge");

    }
    else if (battery>60 && battery>80)
    {
        System.out.println("battery charge is okay for 2 day use");
    }
    else
    {
        System.out.println("battery is full");
    }

}
}

public class mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phone p=new phone();
        p.phonedetails ("VIVO", "Blue","1600", "8");
    }
}




