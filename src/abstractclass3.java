abstract class vehicle1
{
    abstract void start(String s);
    void display()
    {
        System.out.println("This is a vehicle");

    }
}
class carr extends vehicle1
{
    public void start(String s)
    {
        System.out.println("car start with " + s);
    }

}
class motorcycle extends vehicle1
{
   public void start(String s)
    {
        System.out.println("motorcycle start with " + s);
    }

}
public class abstractclass3 {
    public static void main(String[] args) {
        vehicle1 obj=new carr();
        vehicle1 obj2=new motorcycle();
        obj.display();
        obj.start("key");
        obj2.start("kick");


    }
}
