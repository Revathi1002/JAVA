class zomato extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("order is confirmed from zomato");
        }

    }
}
class swiggy extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("order is confirmed from swiggy");
        }

    }
}
public class MULTITHREAD {
    public static void main(String[] args) {
        zomato obj1=new zomato();
        swiggy obj2=new swiggy();
        obj1.start();
        obj2.start();
    }

}