
import java.util.*;

public class array1 {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 classes and 4 students in each class:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the marks of student " + (j + 1) + " in class " + (i + 1) + ":");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The marks of the students are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
