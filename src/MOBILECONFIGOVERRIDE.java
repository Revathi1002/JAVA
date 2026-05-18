class X {
    String mobileBrand;
    double mobileCost;

    X(String mobileBrand, double mobileCost) {
        this.mobileBrand = mobileBrand;
        this.mobileCost = mobileCost;
    }

    // Parent method to be overridden
    void config() {
        System.out.println("=== Parent Class X ===");
        System.out.println("Mobile Brand: " + mobileBrand);
        System.out.println("Mobile Cost: Rs." + mobileCost);
        System.out.println("Configuration: Basic Phone");
    }
}

// Child class Y extends X
class Y extends X {
    int ram;
    String processor;

    Y(String mobileBrand, double mobileCost, int ram, String processor) {
        super(mobileBrand, mobileCost); // Call parent constructor
        this.ram = ram;
        this.processor = processor;
    }

    // Method Overriding - same method name config()
    @Override
    void config() {
        System.out.println("=== Child Class Y ===");
        System.out.println("Mobile Brand: " + mobileBrand);
        System.out.println("Mobile Cost: Rs." + mobileCost);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Processor: " + processor);
        System.out.println("Configuration: 5G Smartphone");
    }
}

public class  MOBILECONFIGOVERRIDE {
    public static void main(String[] args) {
        X obj1 = new X("Nokia", 5000);
        obj1.config();  // Calls parent class X config()

        System.out.println();

        Y obj2 = new Y("Samsung", 35000, 8, "Snapdragon 8 Gen 1");
        obj2.config();  // Calls child class Y config() - OVERRIDDEN
    }

}
