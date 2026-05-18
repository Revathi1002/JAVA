public class array2 {
    public static void main(String[] args) {
        int array[]={2,1,6,3,9,10};
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];

        }
        int avg=sum/array.length;
        System.out.println("sum is : "+sum);
        System.out.println("avg is : "+avg);

    }
}
