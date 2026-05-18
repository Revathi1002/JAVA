import java.util.LinkedHashSet;
public class setlinked {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l=new LinkedHashSet<>();
        l.add(10);
        l.add(51);
        l.add(2);
        l.add(20);
        System.out.println(l);
        l.remove(51);
        System.out.println(l);
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        l.clear();
        System.out.println(l);


    }
}
