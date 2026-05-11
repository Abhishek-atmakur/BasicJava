
public class foreach {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Using for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int[][] arr2 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        System.out.println("\nUsing for-each loop for 2D array:");
        for (int[] row : arr2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int[][][] arr3 = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };
        System.out.println("Using for-each loop for 3D array:");
        for (int[][] matrix : arr3) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
