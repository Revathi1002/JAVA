class dog2 {
    String name;            //variables
    String color;

    dog2(String name, String color) {
        this.name = name;            //constructors
        this.color = color;
    }
    public void dog2details() {
        System.out.println(name + " " + color);            //inheritance
    }
}
class babydogdetails extends dog2 {
    String name;
    String color;                    //variables
    String breed;
    int age;

    babydogdetails(String name, String color, String breed, int age) {
        super(name, color);
        this.age = age;                 // constructors
        this.breed = breed;
    }

    public void babydogdetails() {
        System.out.println(breed + " " + age);            //inheritance
    }
}

public class inherit1 {
    public static void main(String[] args) {
        babydogdetails obj=new babydogdetails("Lucky","white","Shih Tzu",4);
        obj.dog2details();
        obj.babydogdetails();

    }
}


