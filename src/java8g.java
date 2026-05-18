import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class java8g {
    public static void main(String[] args)
    {
        List<Integer> l= Arrays.asList(1,6,5,8,2,4);
        Stream<Integer> s1=l.stream();
        Stream<Integer> s2=s1.filter(i ->i%2==0);
        Stream<Integer> s3=s2.map(i -> i*2);
        int r=s3.reduce(0,(i, j) ->i+j);
        //int r=l.stream(l.filter(i -> i% 2==0).map(i -> i*2).reduce(0,(i, j) ->i+j);
        System.out.println(r);
    }
}
