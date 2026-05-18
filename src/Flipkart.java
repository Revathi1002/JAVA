class product {
    String name;
    double price;

    product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void productDetails() {
        System.out.println("Product: " + name + " | Original Price: Rs." + price);
    }
}

class electronics extends product {
    electronics(String name, double price) {
        super(name, price);
    }

    public void electronicsDiscount() {
        price = price * 0.9; // 10% discount
        System.out.println("Electronics: " + name + " | After 10% off: Rs." + price);
    }
}

class groceries extends product {
    groceries(String name, double price) {
        super(name, price);
    }

    public void groceriesDiscount() {
        price = price * 0.95; // 5% discount
        System.out.println("Groceries: " + name + " | After 5% off: Rs." + price);
    }
}class fashion extends product {
    fashion(String name, double price) {
        super(name, price);
    }

    public void fashionDiscount() {
        price = price * 0.85; // 15% discount
        System.out.println("Fashion: " + name + " | After 15% off: Rs." + price);
    }
}

public class Flipkart {
    public static void main(String[] args) {
        electronics obj1 = new electronics("Smart Watch", 1200);
        obj1.productDetails();
        obj1.electronicsDiscount();

        System.out.println();

        groceries obj2 = new groceries("Wheat Flour", 1000);
        obj2.productDetails();
        obj2.groceriesDiscount();

        System.out.println();

        fashion obj3 = new fashion("Dress", 2000);
        obj3.productDetails();
        obj3.fashionDiscount();
    }
}