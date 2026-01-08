import java.util.*;

public class Questions {
    
    public static void main(String[] args) {

    // Question: Take a matrix as input from the user. Search for a given number x and print the indices at which it is found.

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();    
    
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();

    int[][] matrix = new int[rows][cols];
    
    System.out.println("Enter the elements of the matrix: ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            matrix[i][j] = sc.nextInt();
        }   
        System.out.println(); // Print a newline after each row
    }

    System.out.print("Enter the number to search for: ");
    int x = sc.nextInt();
    boolean found = false;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == x) {
                System.out.println("Number found at indices: (" + i + ", " + j + ")");
                found = true;
            }
        }

    }

        if (!found) {
            System.out.println("Number not found in the matrix.");
        }

    }

    
}
