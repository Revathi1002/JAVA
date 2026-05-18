interface parent1
{
    void parent1demo(String color);

}
interface child1 extends parent1
{
    void child1demo(float height);
}
class grandchild implements child1 {
    public void parent1demo(String color) {
        System.out.println(color);
    }

    public void child1demo(float height) {
        System.out.println(height);
    }
}
public class interfaceclass3 {
    public static void main(String[] args)
    {
        grandchild obj = new grandchild();
        obj.parent1demo("White");
        obj.child1demo(5.4f);
    }
}


