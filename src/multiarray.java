public class multiarray {
    public static void main(String[] args) {
        int array[][] = {
                 {1, 3, 5},
                 {4, 5, 6},
                 {4, 2, 6},
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
