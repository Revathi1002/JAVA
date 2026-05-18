class A1
{
    public void java(){
        System.out.println("Parent data");
}
}
class B1{
    public void child1()
    {
        System.out.println("A data");
    }
}
class C1{
    public void child2()
    {
        System.out.println("R data");
    }

}

public class hirarchialinherit {
    public static void main(String[] args) {
        A1 obj=new A1();
        obj.java();
        B1 obj1=new B1();
        obj1.child1();
        C1 obj2=new C1();
        obj2.child2();


    }
}
