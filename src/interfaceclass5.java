interface Fruit {

    void color();
    void price();


    default void mango1() {
        System.out.println("Mango is Tasty");
    }

    static void apple1() {
        System.out.println("Apple is Healthy");
    }
}

class Apple implements Fruit {

    public void color() {
        System.out.println("Apple color is Red");
    }

    public void price() {
        System.out.println("Apple price is 100");
    }
}

class Mango implements Fruit {
    public void color() {
        System.out.println("Mango color is Yellow");
    }


    public void price() {
        System.out.println("Mango price is 80");
    }
}

public class interfaceclass5 {
    public static void main(String[] args) {
        Apple obj1 = new Apple();
        Mango obj2 = new Mango();

        obj1.color();
        obj1.price();
        Fruit.apple1();

        obj2.color();
        obj2.price();
        obj2.mango1();
    }
}





