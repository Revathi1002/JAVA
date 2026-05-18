import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class demo4 implements Consumer<Integer>
{
    public void accept(Integer i)
    {
        System.out.println(i);
    }
}
public class Java8c
{
    public static void main(String[] args)
    {
        List<Integer> l = Arrays.asList(1, 3, 4, 6, 8, 4);
        Consumer<Integer>obj=new demo4()
        {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };
        obj.accept(12);
    }
}
