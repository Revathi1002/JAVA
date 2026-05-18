class zomatoo implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("order is confirmed from zomato");
        }

    }
}
class swiggyy implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("order is confirmed from swiggy");
        }

    }
}
public class multithreatinterface {
    public static void main(String[] args) {
        zomatoo obj1 = new zomatoo();
        swiggyy obj2 = new swiggyy();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
