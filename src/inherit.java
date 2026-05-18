class A
{
    public void java()
    {
        System.out.println("Java Developers");
    }
}
class B extends  A
{
    public void react()
    {
        System.out.println("React developers");
    }
}
    public class inherit {

    public static void main(String[] args) {

        B obj1=new B();
        obj1.java();
        obj1.react();

    }
}
