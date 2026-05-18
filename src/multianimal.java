class Animal
{
    String color;
    Animal(String color)
    {

        this.color=color;
    }
    public void demo()
    {

        System.out.println(color);
    }
}
class dog11 extends Animal
{
    String name;
    int age;
    dog11(String color,String name,int age)
    {
        super(color);
        this.name=name;
        this.age=age;
    }
    public void demo1()
    {
        System.out.println(color+" "+name+" "+age);
    }

}
class Animal2 extends dog11
{
    String breed;
    Animal2(String color,String name,int age, String breed)
    {
        super(color,name,age);
        this.breed=breed;
    }
    public void demo2()
    {
        System.out.println(name+" "+color+" "+age+" "+breed);
    }

}
public class multianimal {
    public static void main(String[] args) {

        Animal2 obj1=new Animal2("black","Tommy",2,"Labrador");
        obj1.demo2();


    }
}
