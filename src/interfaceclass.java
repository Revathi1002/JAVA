interface A2
{
    void demo();
    void java();
}
class B2 implements A2
{
    public void demo()
    {
        System.out.println("Hello java");
    }
    public void java()
    {
        System.out.println("Hii demo");
    }
}
public class interfaceclass {
    public static void main(String[] args) {
        A2 obj=new B2();
        obj.demo();
        obj.java();
    }
}
