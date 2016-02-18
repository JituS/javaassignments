import static org.junit.Assert.assertTrue;
import org.junit.Test;
import matrix.*;

public class MatrixTest {
  @Test
  public void addition_test_for_2_by_2_mtx() {
  	Matrix matrix = new Matrix(2,2);
  	matrix.put(10,0,0);
  	matrix.put(20,0,1);
  	matrix.put(20,1,0);
  	matrix.put(10,1,1);

  	Matrix anotherMatrix = new Matrix(2,2);
  	anotherMatrix.put(1,0,0);
  	anotherMatrix.put(2,0,1);
  	anotherMatrix.put(2,1,0);
  	anotherMatrix.put(5,1,1);

  	Matrix expectedMtx = new Matrix(2 ,2);
  	expectedMtx.put(11,0,0);
  	expectedMtx.put(22,0,1);
  	expectedMtx.put(22,1,0);
  	expectedMtx.put(15,1,1);
  	Matrix resultMtx = matrix.addWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  }

  @Test
  public void addition_test_for_2_by_3_mtx() {
  	Matrix matrix = new Matrix(2,3);
  	matrix.put(10,0,0);
  	matrix.put(20,0,1);
  	matrix.put(5,0,2);
  	matrix.put(20,1,0);
  	matrix.put(10,1,1);
  	matrix.put(6,1,2);

  	Matrix anotherMatrix = new Matrix(2,3);
  	anotherMatrix.put(3,0,0);
  	anotherMatrix.put(5,0,1);
  	anotherMatrix.put(6,0,2);
  	anotherMatrix.put(2,1,0);
  	anotherMatrix.put(8,1,1);
  	anotherMatrix.put(9,1,2);

  	Matrix expectedMtx = new Matrix(2 ,3);
  	expectedMtx.put(13,0,0);
  	expectedMtx.put(25,0,1);
  	expectedMtx.put(11,0,2);
  	expectedMtx.put(22,1,0);
  	expectedMtx.put(18,1,1);
  	expectedMtx.put(15,1,2);

  	Matrix resultMtx = matrix.addWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  }
  @Test
  public void addition_test_for_negative_mtx() {
  	Matrix matrix = new Matrix(2,3);
  	matrix.put(-10,0,0);
  	matrix.put(20,0,1);
  	matrix.put(-5,0,2);
  	matrix.put(20,1,0);
  	matrix.put(10,1,1);
  	matrix.put(-6,1,2);

  	Matrix anotherMatrix = new Matrix(2,3);
  	anotherMatrix.put(3,0,0);
  	anotherMatrix.put(5,0,1);
  	anotherMatrix.put(6,0,2);
  	anotherMatrix.put(2,1,0);
  	anotherMatrix.put(8,1,1);
  	anotherMatrix.put(9,1,2);

  	Matrix expectedMtx = new Matrix(2 ,3);
  	expectedMtx.put(-7,0,0);
  	expectedMtx.put(25,0,1);
  	expectedMtx.put(1,0,2);
  	expectedMtx.put(22,1,0);
  	expectedMtx.put(18,1,1);
  	expectedMtx.put(3,1,2);

  	Matrix resultMtx = matrix.addWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  }

  
  @Test
  public void multiplication_test_for_2_by_2_and_2_by_2_matrix() {
  	Matrix matrix = new Matrix(2,2);
  	matrix.put(1,0,0);
  	matrix.put(2,0,1);
  	matrix.put(2,1,0);
  	matrix.put(1,1,1);

  	Matrix anotherMatrix = new Matrix(2,2);
  	anotherMatrix.put(2,0,0);
  	anotherMatrix.put(1,0,1);
  	anotherMatrix.put(1,1,0);
  	anotherMatrix.put(2,1,1);

  	Matrix expectedMtx = new Matrix(2 ,2);
  	expectedMtx.put(4,0,0);
  	expectedMtx.put(5,0,1);
  	expectedMtx.put(5,1,0);
  	expectedMtx.put(4,1,1);

  	Matrix resultMtx = matrix.multiplyWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  }  
  
  @Test
  public void multiplication_test_for_2_by_3_and_3_by_2_matrix() {
  	Matrix matrix = new Matrix(2,3);
  	matrix.put(1,0,0);
  	matrix.put(2,0,1);
  	matrix.put(3,0,2);
  	matrix.put(4,1,0);
  	matrix.put(5,1,1);
  	matrix.put(6,1,2);

  	Matrix anotherMatrix = new Matrix(3,2);
  	anotherMatrix.put(7,0,0);
  	anotherMatrix.put(8,0,1);
  	anotherMatrix.put(9,1,0);
  	anotherMatrix.put(10,1,1);
  	anotherMatrix.put(11,2,0);
  	anotherMatrix.put(12,2,1);

  	Matrix expectedMtx = new Matrix(2 ,2);
  	expectedMtx.put(58,0,0);
  	expectedMtx.put(64,0,1);
  	expectedMtx.put(139,1,0);
  	expectedMtx.put(154,1,1);

  	Matrix resultMtx = matrix.multiplyWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  }  
  @Test
  public void multiplication_test_for_3_by_2_and_2_by_3_matrix() {
  	Matrix matrix = new Matrix(3,2);
  	matrix.put(1,0,0);
  	matrix.put(2,0,1);
  	matrix.put(3,1,0);
  	matrix.put(4,1,1);
  	matrix.put(5,2,0);
  	matrix.put(6,2,1);

  	Matrix anotherMatrix = new Matrix(2,3);
  	anotherMatrix.put(7,0,0);
  	anotherMatrix.put(8,0,1);
  	anotherMatrix.put(9,0,2);
  	anotherMatrix.put(10,1,0);
  	anotherMatrix.put(11,1,1);
  	anotherMatrix.put(12,1,2);

  	Matrix expectedMtx = new Matrix(3 ,3);
  	expectedMtx.put(27,0,0);
  	expectedMtx.put(30,0,1);
  	expectedMtx.put(33,0,2);
  	expectedMtx.put(61,1,0);
  	expectedMtx.put(68,1,1);
  	expectedMtx.put(75,1,2);
  	expectedMtx.put(95,2,0);
  	expectedMtx.put(106,2,1);
  	expectedMtx.put(117,2,2);

  	Matrix resultMtx = matrix.multiplyWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  }
}