
import java.util.Arrays;
import  java.util.List;
import  java.util.function.Predicate;
import java.util.stream.Stream;

public class Java8e {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,3,5,4,6,8);
        Stream<Integer> s1=l.stream();
        s1.filter(i -> i%2==0)
          .forEach(System.out::println);
    }
}
