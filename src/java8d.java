import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class java8d {
    public static void main(String[] args)
    {
        List<Integer> l= Arrays.asList(1, 4, 6, 7, 5);
        Stream<Integer> s1=l.stream();
        s1.forEach(System.out::println);
       // l.forEach(System.out.println();

    }
}