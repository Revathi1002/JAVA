import java.util.ArrayList;

public class collectionlistarray{
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Chandu");
        l.add("Revathi");
        l.add("Anu");
        System.out.println(l);
        l.add(2, "Anu");  //Using index value we can add the value
        System.out.println(l);
        l.addFirst("Cherry");    //The value are added at the first
        System.out.println(l);
        l.addLast("Tejas");
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        System.out.println(l.get(2));
        l.set(0, "Sanvi");
        System.out.println(l);
        System.out.println(l.size());
        l.removeLast();
        System.out.println(l);
        System.out.println(l.isEmpty());
        System.out.println(l.contains("Sanvi"));
        System.out.println(l.reversed());
        System.out.println(l.equals("Amrutha"));
    }
}


