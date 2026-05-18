class Employee extends Thread{
    String id;
    String name;
    String role;
    String cname;
    String dname;
    Employee(String id,String name,String role,String cname,String dname)
    {
        this.id=id;
        this.name=name;
        this.role=role;
        this.cname=cname;
        this.dname=dname;
    }
    public void run()
    {
        System.out.println("Company is opening at 9AM");
        try{
            Thread.sleep(5000);
        }catch(Exception e) {
            System.out.println("Company is opened");
        }
        try{
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Company is closed");
        try{
            Thread.sleep(5000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("product details");
        System.out.println(id+" "+name+" "+role+" "+dname+" "+cname);

    }
}
class company4 extends Thread {

    String name;
    String branch;
    String address;

    company4(String name, String branch, String address) {
        this.name = name;
        this.branch = branch;
        this.address = address;

    }

    public void run() {
        System.out.println("workinhg in IT Company");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Company is well structured");
        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Company is closing at 6PM");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("product details");
        System.out.println(name + " " + branch + " " + address);
    }
}


public class multithread4 {
    public static void main(String[] args) {
        Employee E = new Employee("ABCD1244", "Tejas", "Developer", "TCS", "JAVA");
        E.start();
        company4 c = new company4("Infosys", "Python","Electronic city Banglore");
        c.start();

    }
}

