import java.util.Scanner;

/**
 * Created by zandraa on 3/22/2017.
 */
public class DiagonalMatrix {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Height of the matrix?");
    int dimension = myScanner.nextInt();
    int[][] matrix = new int[dimension][dimension];

    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        if (i == j) {
          matrix[i][j] = 1;
        }
        else {
          matrix[i][j] = 0;
        }
      }
    }

    for(int[] row : matrix) {
      for(int element : row) {
        System.out.print(element);
      }
      System.out.println("");
    }
  }
}

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output