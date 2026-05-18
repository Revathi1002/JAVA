abstract class R1
{
    abstract void name();

}

public class anonymousclass {
    public static void main(String[] args) {
        R1 obj = new R1() {
            public void name() {
                System.out.println("Java Developer");
            }
        };

        obj.name();
    }
}


