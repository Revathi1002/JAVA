class zepto implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("order is confirmed from zepto");
        }

    }
}
class insta implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("order is confirmed from insta");
        }

    }
}
public class multithread1 {
    public static void main(String[] args) {
        zepto obj1=new zepto();
        insta obj2=new insta();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        try{
            Thread.sleep( 5000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();

    }
}
