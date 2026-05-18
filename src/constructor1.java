class rev
{
    String name;
    int age;
    rev(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void java()
    {
        System.out.println(name+" "+age);
    }

}
    public class constructor1 {

    public static void main(String[] args) {
        rev obj= new rev("Tejas",6);

        obj.java();


    }
}
