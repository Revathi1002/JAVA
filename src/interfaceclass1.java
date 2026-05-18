interface A11
{
    default void person(String name,int age)
    {
        System.out.println(name+" "+age);
    }
    static void dog(String color)
    {
        System.out.println(color);
    }
}
class B11 implements A11
{

}
public class interfaceclass1 {
    public static void main(String[] args) {
       B11 obj=new B11();
        obj.person("Ajay",10);
        A11.dog("White");

    }
}
