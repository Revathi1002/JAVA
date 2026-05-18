import java.util.HashSet;

public class Sethash {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(10);
        h.add(5);
        h.add(2);
        h.add(20);
        System.out.println(h);
        h.remove(5);
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        System.out.println(h.contains(20));
        h.clear();
        System.out.println(h);
    }
}
