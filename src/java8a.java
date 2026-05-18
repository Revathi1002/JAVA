interface abcde
{
    void idea(int i,int j);

}

public class java8a {
    public static void main(String[] args) {
        abcde obj=(int i,int j) -> System.out.println("developers " + (i+j));
        obj.idea(9,9);

    }
}
