class Customer extends Thread {
    String cname;
    String cid;
    String startpoint;
    String endpoint;
    int amount;
    int activeDrivers;

    Customer(String cname, String cid, String startpoint, String endpoint, int amount, int activeDrivers) {
        this.cname = cname;
        this.cid = cid;
        this.startpoint = startpoint;
        this.endpoint = endpoint;
        this.amount = amount;
        this.activeDrivers = activeDrivers;
    }

    public void run() {
        System.out.println("Looking for available cab");

        if (activeDrivers > 0) {
            System.out.println("Booking successful " + cname);
            if (amount >= 500) {
                System.out.println(cid + " " + cname + " " + startpoint + " " + endpoint + " " + amount + " " + activeDrivers);
            } else {
                System.out.println("No service available at the moment");
            }
        }
    }

    class Cab extends Thread {
        String cabname;
        String cabid;
        String service;

        Cab(String cabname, String cabid, String service) {
            this.cabname = cabname;
            this.cabid = cabid;
            this.service = service;
        }

        public void run() {
            System.out.println("Looking for available Cab");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }

            if (service.equalsIgnoreCase("uber")) {
                System.out.println("Request accepted " + cabname);
                System.out.println("Cab info " + cabid);
                System.out.println(cabid + " " + cabname + " " + service);
            } else {
                System.out.println("Request declined");
            }
        }
    }

    class Auto extends Thread {
        String licenseplate;
        String capacity;
        String type;

        Auto(String licenseplate, String capacity, String type) {
            this.licenseplate = licenseplate;
            this.capacity = capacity;
            this.type = type;
        }

        public void run() {
            System.out.println("Auto details");
            System.out.println(licenseplate + " " + capacity + " " + type);
        }
    }
}

public class multithreading5 {
    public static void main(String[] args) {
        Customer c = new Customer("Meera", "C1234", "Hoskote", "Whitefield", 500, 2);
        c.start();

        Customer.Cab cb = c.new Cab("Tejas", "S102", "UBER");
        cb.start();

        Customer.Auto a = c.new Auto("KA02XY5687", "3 seater", "UBER");
        a.start();
    }
}
