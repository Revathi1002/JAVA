interface parent3
{
    void parentdemo(String color);
}
interface parent4
{
    void childdemo(float height);
}
class grandchild2 implements parent3,parent4
{
    public void parentdemo(String color)
    {
        System.out.println(color);
    }
    public void childdemo(float height)
    {
        System.out.println(height);
    }

}
public class multipleinterface {
    public static void main(String[] args) {
        grandchild2 g=new grandchild2();
        g.parentdemo("Cherry");
        g.childdemo(5.4f);

    }
}
