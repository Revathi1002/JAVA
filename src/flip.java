class product1 {
    String name;
    double price;

    product1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class electronics1 extends product1 {
    electronics1(String name, double price) {
        super(name, price);
    }

    public double electronicsDiscount() {
        return price * 0.9;  // 10% discount
    }
}

class groceries1 extends product1 {
    groceries1(String name, double price) {
        super(name, price);
    }

    public double groceriesDiscount() {
        return price * 0.95;  // 5% discount
    }
}

class fashion1 extends product1 {
    fashion1(String name, double price) {
        super(name, price);
    }

    public double fashionDiscount() {
        return price * 0.85;  // 15% discount
    }
}

public class flip {
    public static void main(String[] args) {
        electronics1 obj1 = new electronics1("watch", 25000);
        System.out.println("Watch price: " + obj1.getPrice());
        double m = obj1.electronicsDiscount();
        System.out.println(m);

        groceries1 obj2 = new groceries1("flour", 500);
        System.out.println("Flour price: " + obj2.getPrice());
        double n = obj2.groceriesDiscount();
        System.out.println(n);

        fashion1 obj3 = new fashion1("dress", 15000);
        System.out.println("Dress price: " + obj3.getPrice());
        double v = obj3.fashionDiscount();
        System.out.println(v);
    }
}

