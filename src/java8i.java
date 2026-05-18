import java.util.Arrays;
import java.util.List;


public class java8i {
    public static void main(String[] args)
    {
        List<String> names=Arrays.asList("Rev","Chandu","Aishu","Monika","Ramya");
        names.stream()
                .filter(name -> name.startsWith("R"))
                .forEach(System.out::println);


    }
}
