class dog1
{
    String name;
    int age;
    String bread;
    String color;
    dog1(String name, int age, String bread, String color)
    {
        this.name=name;
        this.age=age;
        this.bread=bread;
        this.color=color;
    }
    public void java()
    {
        System.out.println(name+" "+age+" "+bread+" "+color);
    }

}

    public class constructor2 {

    public static void main(String[] args) {
        dog1 obj=new dog1("Lucky",4,"ShihTzu","white");
        obj.java();

    }
}
