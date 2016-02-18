import static org.junit.Assert.assertTrue;
import org.junit.Test;
import matrix.*;
import java.util.Arrays;

public class MatrixTest {
  @Test
  public void addition_test_for_2_by_2_mtx() {
  	Matrix matrix = new Matrix();
  	int[][] matrix_a = new int[][]{
  	  { 1, 2},
  	  { 2, 3}
  	};
  	int[][] matrix_b = new int[][]{
  	  { 7, 2},
  	  { 5, 9}
  	};
  	int[][] expected = new int[][]{
  	  { 8, 4},
  	  { 7, 12}
  	};
  	int[][] result = matrix.addMatrices(matrix_a,matrix_b);
  	assertTrue(Arrays.deepEquals(result, expected));
  }

  @Test
  public void addition_test_for_3_by_3_mtx() {
  	Matrix matrix = new Matrix();
  	int[][] matrix_a = new int[3][3];
  	int[][] matrix_b = new int[3][3];
  	for (int i = 0;i < matrix_a.length ;i++ ) {
  		Arrays.fill(matrix_a[i], 7);
  		Arrays.fill(matrix_b[i], 2);
  	}
  	int[][] expected = new int[][]{
  	  { 9, 9, 9},
  	  { 9, 9, 9},
  	  { 9, 9, 9}
  	};
  	int[][] result = matrix.addMatrices(matrix_a,matrix_b);
  	assertTrue(Arrays.deepEquals(result, expected));
  }

  @Test
  public void addition_test_for_5_by_5_mtx() {
  	Matrix matrix = new Matrix();
  	int[][] matrix_a = new int[5][5];
  	int[][] matrix_b = new int[5][5];
  	for (int i = 0;i < matrix_a.length ;i++ ) {
  		Arrays.fill(matrix_a[i], 1);
  		Arrays.fill(matrix_b[i], 2);
  	}
  	int[][] expected = new int[][]{
  	  { 3, 3, 3, 3, 3},
  	  { 3, 3, 3, 3, 3},
  	  { 3, 3, 3, 3, 3},
  	  { 3, 3, 3, 3, 3},
  	  { 3, 3, 3, 3, 3}
  	};
  	int[][] result = matrix.addMatrices(matrix_a,matrix_b);
  	assertTrue(Arrays.deepEquals(result, expected));
  }
  @Test
  public void addition_test_for_2_by_3_mtx() {
  	Matrix matrix = new Matrix();
  	int[][] matrix_a = new int[2][3];
  	int[][] matrix_b = new int[2][3];
  	for (int i = 0;i < matrix_a.length ;i++ ) {
  		Arrays.fill(matrix_a[i], 1);
  		Arrays.fill(matrix_b[i], 2);
  	}
  	int[][] expected = new int[][]{
  	  { 3, 3, 3},
  	  { 3, 3, 3}
  	};
  	int[][] result = matrix.addMatrices(matrix_a,matrix_b);
  	assertTrue(Arrays.deepEquals(result, expected));
  }
}