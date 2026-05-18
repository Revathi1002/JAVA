class bankloan
{
    public  double intrest()
    {
        return 9.8;
    }
}
class vehicleloan extends bankloan
{
    public  double intrest()
    {
        return 8.0;
    }
}
class educationloan extends bankloan
{
    public  double intrest()
    {
        return 7.5;
    }

}
class personalloan extends bankloan
{
    public  double intrest()
    {
        return 7.0;
    }

}
public class methodoverridebank {
    public static void main(String[] args) {
        bankloan obj=new bankloan();
        System.out.println("vehicleloan intrest is 8.0");
        System.out.println("educationloan intrest is  7.5");
        System.out.println("personalloan intrest is 7.0");

    }
}
