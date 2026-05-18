
class student
{
    String name="Revathi";
    String branch="CSE";
    int rollno=21;
    int phoneno=123456789;

}
class employee
{
    String name="Chandana";
    String role="developer";
    int salary=350000;
}
    public class oopstudent {
   public static void main(String[] args) {
       student obj=new student();
       employee obj1=new employee();
       System.out.println(obj.name +" " +obj.rollno +" " +obj.phoneno);
       System.out.println(obj1.name +" " +obj1.role +" "+obj1.salary);

    }
}
