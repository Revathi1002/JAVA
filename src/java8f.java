import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class java8f {
    public static void main(String[] args){
        List<Integer> l= Arrays.asList(1,6,5,8,2,4);
        Stream<Integer> s1=l.stream();
        Stream<Integer> s2=s1.filter(i -> i%2==0);
        Stream<Integer> s3=s2.map(i -> i*2);
        s3.forEach(System.out::println);
    }
}
