interface company
{
    void companydetails(String cname, String address);
}
interface company1 extends company
{
    void company1details(String cname,int salary);
}
interface company2 extends company
{
    void company2details(String dname,String project);
}
class company3 implements company1
{
    public void companydetails(String cname, String address)
    {
        System.out.println(cname+" "+address);
    }
    public void company1details(String cname,int salary)
    {
        System.out.println(cname+" "+salary);
    }
    public void company2details(String dname, String project)
    {
        System.out.println(dname+" "+project);
    }

}

public class interfaceclass4 {
    public static void main(String[] args) {
        company3 c= new company3();
       c.companydetails("TATA","BANGLORE");
       c.company1details("INFOSYS",35000);
       c.company2details("Developer","JAVA");

    }
}
