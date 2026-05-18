import java.util.Scanner;

    class nexon {
        String color;
        int regno;

        public void car() {
            color = "white";
            regno = 2410;

            System.out.println("Nexon details");
            System.out.println("color: " + color);

            System.out.println("reg no:" + regno);
        }
    }
    class BMW {
        String color;
        String fueltype;

        public void car() {
            color = "black";
            fueltype = "petrol";
            System.out.println("BMW details");
            System.out.println("color: " + color);
            System.out.println("fuel type:" + fueltype);
        }
    }
    public class car1  {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            nexon n = new nexon();
            n.car();
            System.out.println();
            BMW b = new BMW();
            b.car();
            sc.close();
        }
    }








