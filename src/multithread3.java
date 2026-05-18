class zeptoo extends Thread{
    String id;
    String pname;
    int price;
    zeptoo(String id,String pname,int price)
    {
        this.id=id;
        this.pname=pname;
        this.price=price;
    }
    public void run()
    {
        System.out.println("order is confirmed with order id "+id);
        try{
            Thread.sleep(5000);
        }catch(Exception e) {
            System.out.println("order is packing");
        }
        try{
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("order is on the way");
        try{
            Thread.sleep(5000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("product details");
        System.out.println(pname+" "+price);

    }
}
class instamart extends Thread {
    String id;
    int quantity;
    String name;

    instamart(String id, String name, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public void run() {
        System.out.println("order is confirmed with order id " + id);
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
            System.out.println("order is shipping");
        }
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("order is shipped");
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("product details");
        System.out.println(name + " " + quantity);

    }
}
class bigbasket extends Thread {
    String id;
    int quantity;
    String flavour;

    bigbasket(String id, String flavour, int quantity) {
        this.flavour = flavour;
        this.id = id;
        this.quantity = quantity;
    }

    public void run() {
        System.out.println("order is confirmed with order id " + id);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("order is picked by the delivery man");
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Delivery man is reached near location");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("product details");
        System.out.println(flavour + " " + quantity);

    }
}
class game1 extends Thread {
    String color;
    String fuel;
    String name;

    game1(String color, String name, String fuel) {
        this.name = name;
        this.fuel = fuel;
        this.color = color;
    }

    public void run() {
        System.out.println("Car is going to start");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("car is starting be ready");
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("car is moving");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("product details");
        System.out.println(name + " " + color + " " + fuel);

    }
}


    public class multithread3 {
        public static void main(String[] args) {
            zeptoo z = new zeptoo("Rev2410zEPT", "Cadbaury", 500);
            z.start();
            instamart i = new instamart("ABCD7654TISH", "Ice Cream", 4);
            i.start();
            bigbasket b = new bigbasket("QRST35546ABYS", "Chocolate", 5);
            b.start();
            game1 g = new game1("Pink", "Thar", "Petrol");
            g.start();
        }
    }

