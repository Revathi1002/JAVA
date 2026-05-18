class parent
{
    public void demo(int a)
    {
        System.out.println("parent mobile"+a);
    }
}
class child extends parent
{
    public void demo(String a)
    {
        System.out.println("child mobile"+a);
    }
}
public class methodoverride {
    public static void main(String[] args) {
        child obj=new child();
        obj.demo("iphone");


    }
}
