class cap
{
    private String pname="chocolate";
    private int price=500;

    public String getpname()
    {
        return pname;
    }
    public int getprice()
    {
        return price;
    }
    public void setpname(String pname)
    {
        this.pname=pname;
    }
    public void setprice(int price)
    {
        this.price=price;
    }

}

public class encap {
    public static void main(String[] args) {
        cap obj=new cap();
        System.out.println("old product"+" "+obj.getpname());
        System.out.println("old price"+" "+obj.getprice());
        obj.setpname("Oreo chocolate");
        obj.setprice(1000);
        System.out.println("new product"+" "+obj.getpname());
        System.out.println("new price"+" "+obj.getprice());


    }
}
