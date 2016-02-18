import static org.junit.Assert.assertTrue;
import org.junit.Test;
import matrix.*;
import java.util.Arrays;

public class MatrixTest {
  @Test
  public void addition_test_for_2_by_2_mtx() {
  	Matrix a = new Matrix(2,2);
  	a.populate(10,0,0);
  	a.populate(20,0,1);
  	a.populate(20,1,0);
  	a.populate(10,1,1);

  	int[][] matrix = new int[][]{
  	  { 1, 2},
  	  { 2, 3}
  	};
  	int[][] expected = new int[][]{
  	  { 11, 22},
  	  { 22, 13}
  	};
  	int[][] result = a.addMatrices(matrix);
  	assertTrue(Arrays.deepEquals(result, expected));
  }

  @Test
  public void addition_test_for_3_by_3_mtx() {
  	Matrix a = new Matrix(3,3);
  	a.populate(10,0,0);
  	a.populate(20,0,1);
  	a.populate(22,0,2);

  	a.populate(2,1,0);
  	a.populate(6,1,1);
  	a.populate(2,1,2);

  	a.populate(2,2,0);
  	a.populate(6,2,1);
  	a.populate(2,2,2);

  	int[][] matrix = new int[][]{
  	  { 1, 2, 3},
  	  { 2, 3, 4},
  	  { 1, 3, 5}
  	};
  	int[][] expected = new int[][]{
  	  { 11, 22, 25},
  	  { 4, 9, 6},
  	  { 3, 9, 7}
  	};
  	int[][] result = a.addMatrices(matrix);
  	assertTrue(Arrays.deepEquals(result, expected));
  }

  @Test
  public void addition_test_for_2_by_3_mtx() {
  	Matrix a = new Matrix(2,3);
  	a.populate(10,0,0);
  	a.populate(20,0,1);
  	a.populate(22,0,2);

  	a.populate(2,1,0);
  	a.populate(6,1,1);
  	a.populate(2,1,2);

  	int[][] matrix = new int[][]{
  	  { 1, 2, 3},
  	  { 2, 3, 4}
  	};
  	int[][] expected = new int[][]{
  	  { 11, 22, 25},
  	  { 4, 9, 6}
  	};
  	int[][] result = a.addMatrices(matrix);
  	assertTrue(Arrays.deepEquals(result, expected));
  }
  @Test
  public void addition_test_for_negative_mtx() {
  	Matrix a = new Matrix(2,3);
  	a.populate(-10,0,0);
  	a.populate(-20,0,1);
  	a.populate(22,0,2);

  	a.populate(2,1,0);
  	a.populate(-6,1,1);
  	a.populate(2,1,2);

  	int[][] matrix = new int[][]{
  	  { 1, 2, 3},
  	  { 2, 3, 4}
  	};
  	int[][] expected = new int[][]{
  	  { -9, -18, 25},
  	  { 4, -3, 6}
  	};
  	int[][] result = a.addMatrices(matrix);
  	assertTrue(Arrays.deepEquals(result, expected));
  }
}