class vehicle
{
    String no_wheels;
    String fuel_type;
    vehicle(String no_wheels,String fuel_type)
    {
        this.no_wheels=no_wheels;
        this.fuel_type=fuel_type;
    }
    public void vehicledetails()
    {
        System.out.println(no_wheels+" "+fuel_type);
    }
}
class Bike extends vehicle
{
    String color;
    String reg_no;
    String fuel_type;
    Bike(String no_wheels,String fuel_type,String color,String reg_no)
    {
        super(no_wheels, fuel_type);
        this.color = color;
        this.reg_no = reg_no;

    }
    public void Bikedetails()
    {
        System.out.println(no_wheels+" "+color+" "+reg_no+" "+fuel_type);
    }
}
class Rider extends Bike{

    double  price;
    Rider(String no_wheels,String color,String fuel_type,String reg_no,double price)
    {
        super(no_wheels,fuel_type,reg_no,color);
        this.price=price;
    }
    public void Riderdetails(){
        System.out.println(no_wheels+" "+color+" "+reg_no+" "+fuel_type+" "+price);
    }
}
public class multilevelinherit1 {
    public static void main(String[] args) {
        Rider obj=new Rider("2", "Black", "Petrol","KA0134",150000);

        obj.Riderdetails();


    }
}
