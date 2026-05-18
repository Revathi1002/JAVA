import java.util.PriorityQueue;
public class collectionlist {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.offer(50);
        p.offer(90);
        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.remove();
        System.out.println(p);
        p.offer(12);
        System.out.println(p);
        p.peek();
        System.out.println(p);
        //p.clear();
        System.out.println(p);
        System.out.println(p.size());
        System.out.println(p.isEmpty());
        p.remove(12);
        System.out.println(p);
        p.remove(50);
        System.out.println(p);
    }

}



