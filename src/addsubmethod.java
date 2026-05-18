class abc
{
    public void add(int m, int n)
    {
        System.out.println("addition" +(m+n));
    }
    public int sub(int m, int n)
    {
        return m-n;
    }
}
    public class addsubmethod {

    public static void main(String[] args) {
        abc obj1=new abc();
        obj1.add (8,9);
        int r1=obj1.sub(7,5);

        System.out.println("Subtraction is " +r1);

    }
}
