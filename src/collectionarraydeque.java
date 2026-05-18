import java.util.ArrayDeque;

public class collectionarraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> p = new ArrayDeque<>();
        p.push(20);
        p.push(30);
        p.offer(10);
        System.out.println(p);
        p.pop();
        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.pollFirst();
        System.out.println(p);
        p.pollLast();
        p.add(300);
        System.out.println(p);
        System.out.println(p);
        p.offerFirst(100);
        System.out.println(p);
        p.offerLast((200));
        System.out.println(p);
        p.peek();
        System.out.println(p.peek());
       // p.peekFirst();
        System.out.println(p.peekFirst());
        System.out.println(p.peekLast());

    }

}



