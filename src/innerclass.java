class outer
{
    class inner            //public
    {
        void demo()
        {
            System.out.println("Inner class");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        outer o=new outer();
        outer.inner i=o.new inner();
        i.demo();

    }
}
