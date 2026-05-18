import java.util.Stack;
import java.util.Vector;

public class collectionlistvector {
    public static void main(String[] args) {
        Vector<String> l = new Vector<>();
        l.add("Chandu");
        l.add("Revathi");
        l.add("Anu");
        System.out.println(l);
        l.add(2, "Anu");  //Using index value we can add the value
        System.out.println(l);
        l.add(0,"Cherry");    //The value are added at the first
        System.out.println(l);
        l.add("Tejas");
        System.out.println(l);
        System.out.println(l.get(2));
        l.set(0, "Sanvi");
        System.out.println(l);
        System.out.println(l.size());
        l.remove(l.size()-1);
        System.out.println(l);
        System.out.println(l.isEmpty());
        System.out.println(l.contains("Sanvi"));

}

}
