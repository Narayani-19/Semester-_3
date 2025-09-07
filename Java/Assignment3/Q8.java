//	Q8. Write a program to input a jagged array and display it.
import java.util.Scanner;

public class JaggedArray {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        
        int[][] jaggedArray = new int[r][];

        
        for (int i = 0; i < r; i++) {
            System.out.print("Enter number of columns in row " + (i + 1) + ": ");
            int c = sc.nextInt();

            jaggedArray[i] = new int[c]; // create row with given size

            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < c; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
