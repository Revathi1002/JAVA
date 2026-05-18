interface i{
    default void java()
    {
        System.out.println("HAI");
    }
    static  void python()
    {
        System.out.println("HELLO");
    }
}
class j implements i{

}

public class java8 {
    public static void main(String[] args) {
        j obj=new j();
        obj.java();
        i.python();
    }
}
