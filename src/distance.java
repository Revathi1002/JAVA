import java.util.Scanner;

class car {
    int m;
    int speed =m;

    public void carspeed(int a) {
        System.out.println("current speed "+speed+ " "  + "km/hr+ " );

    }
}
        public class distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Increase the accelarator");
        int n=sc.nextInt();
        car obj1=new car();
        obj1.carspeed(n);




    }
}
