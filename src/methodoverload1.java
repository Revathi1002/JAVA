class overload {

    public void area(int side) {
        System.out.println("area of square is" + side * side);

    }

    public void area(int length, int breadth) {
        System.out.println("area of rectangle is" + length * breadth);
    }                                                                   //area of rectangle

    public void area(float radius) {
        System.out.println("area of circle is" + (3.14 * radius * radius));                  // area of circle
    }
}
    public class methodoverload1
    {
    public static void main(String[] args)
    {
        overload obj=new overload();
        obj.area(12);
        obj.area(4,7);


    }

    }

