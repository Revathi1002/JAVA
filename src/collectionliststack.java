import java.util.*;

public class collectionliststack{
    public static void main(String[] args) {
        Stack<String> l = new Stack<>();
        l.add("Chandu");   //To insert the data or value
        System.out.println(l);
        l.add(1, "Hai");  //Using index value we can add the value
        System.out.println(l);
        l.addFirst("Hello");    //The value are added at the first
        System.out.println(l);
        l.addLast("Manya");
        System.out.println(l);
        l.add("Good morning");
        System.out.println(l.reversed());
        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.contains("Manya"));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.isEmpty());
        l.remove(1);
        System.out.println(l);
        System.out.println(l.isEmpty());
        System.out.println(l.reversed());
        System.out.println(l.size());
        l.remove(3);
        System.out.println(l);
        l.addFirst("Manya");
        System.out.println(l);
        System.out.println(l.pop());
        System.out.println(l.push("Welcome"));
    }

    }
