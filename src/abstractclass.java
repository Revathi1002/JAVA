abstract class name
{
    abstract void java();
    abstract void display();

    {
        System.out.println("hello is");
    }
}

class demoo extends name
{
    public void java()
    {
        System.out.println("Hello");
    }
    public void display()
    {
        System.out.println("HII");
    }

}
public class abstractclass {
    public static void main(String[] args) {
        demoo obj=new demoo();
        obj.java();
        obj.display();

    }
}
