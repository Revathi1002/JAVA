abstract class react
{
    abstract void message(String m);
    void success()
    {
        System.out.println("data is updated");
    }
}
class java extends react {
    void message(String m) {
        System.out.println(" Message sent");
    }

}
public class abstractclass1 {
    public static void main(String[] args) {
        java obj=new java();
        obj.success();
       obj.message("Hai");


    }
}
