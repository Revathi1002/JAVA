public class exception1 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        try{
            System.out.println(array[8]);
        }

        catch(Exception e)
        {
            System.out.println("modification not possible");
        }
        finally
        {
            System.out.println("Hai");
            }
        }

    }

