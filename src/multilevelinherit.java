
class P
{
    public void java()
    {
        System.out.println("grand parent");
    }
}
class R extends P
{
    public void node()
    {
        System.out.println("both parent and child");
    }
}
class S extends R{
    public void inherit()
    {
        System.out.println("child");
    }
}

    public class multilevelinherit {

    public static void main(String[] args) {
         S obj=new S();
         obj.java();
         obj.node();
         obj.inherit();
    }
}
