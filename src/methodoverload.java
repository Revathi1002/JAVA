class abcd
{
    public void java(int a, int b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}


public class methodoverload {
   public static void main(String[] args) {
       abcd obj=new abcd();
       obj.add(3,5,9);


    }
}
