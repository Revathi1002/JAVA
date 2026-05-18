class AB {
    void demo() {
        class BC {
            void rev() {
                System.out.println("Method local inner class");
            }
        }

        BC obj1 = new BC();
        obj1.rev();
    }
}


public class methodlocal {
    public static void main(String[] args) {
        AB obj=new AB();
        obj.demo();
    }

    }

