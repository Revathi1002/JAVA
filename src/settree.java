import java.util.TreeSet;

public class settree {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>();
        h.add(10);
        h.add(51);
        h.add(2);
        h.add(20);
        System.out.println(h);
        h.remove(10);
        System.out.println(h);
        System.out.println(h.first());
        System.out.println(h.last());
        System.out.println(h.lower(23));
        System.out.println(h.higher(20));
        System.out.println(h.floor(30));
        System.out.println(h.ceiling(10));
        System.out.println(h.isEmpty());
        System.out.println(h.contains(2));
        System.out.println(h.descendingSet());
        System.out.println(h.size());
       // h.clear();
        System.out.println(h);
        h.clone();
        System.out.println(h);
    }
}
