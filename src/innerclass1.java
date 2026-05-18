class outer1
{
    private class inner1
    {
        void demo()                     //private
        {
            System.out.println("Inner class");
        }
    }
    void fullstack()
    {
        inner1 i=new inner1();
        i.demo();
    }
}
public class innerclass1 {
    public static void main(String[] args)
    {
        outer1 o=new outer1();
        o.fullstack();
    }
}
