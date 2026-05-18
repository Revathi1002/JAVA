class divide
{
    public void multi(int m, int n)
    {
        System.out.println("multiplication" +(m*n));
    }
    public int sub(int m, int n)
    {
        return m/n;
    }
}
public class muldivmethod {

    public static void main(String[] args) {
        divide obj1 = new divide();
        obj1.multi(2, 9);
        int r1 = obj1.sub(10, 2);

        System.out.println("division is " + r1);
    }
}
