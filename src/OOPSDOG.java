class person1
{
    String name="Tejas";
    int age=19;
}
class dog
{
    String name="Charlie";
    String color="White";
    int age=4;
}
public class OOPSDOG {
    public static void main(String[] args) {
        person1 obj=new person1();
        dog obj1=new dog();
        System.out.println(obj.name +" " +obj.age);
        System.out.println(obj1.name +" " +obj1.color +" "+obj1.age);


    }
}
