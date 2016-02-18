import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import matrix.*;

public class MatrixTest {
  @Test
  public void addition_test_for_2_by_2_mtx() {
  	Matrix matrix = new Matrix(2,2);
  	matrix.put(10);
  	matrix.put(20);
  	matrix.put(20);
  	matrix.put(10);

  	Matrix anotherMatrix = new Matrix(2,2);
  	anotherMatrix.put(1);
  	anotherMatrix.put(2);
  	anotherMatrix.put(2);
  	anotherMatrix.put(5);

  	Matrix expectedMtx = new Matrix(2 ,2);
  	expectedMtx.put(11);
  	expectedMtx.put(22);
  	expectedMtx.put(22);
  	expectedMtx.put(15);

  	Matrix resultMtx = matrix.addWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  	assertTrue(expectedMtx.equals(resultMtx));
  }

  @Test
  public void addition_test_for_2_by_3_mtx() {
  	Matrix matrix = new Matrix(2,3);
  	matrix.put(10);
  	matrix.put(20);
  	matrix.put(5);
  	matrix.put(20);
  	matrix.put(10);
  	matrix.put(6);

  	Matrix anotherMatrix = new Matrix(2,3);
  	anotherMatrix.put(3);
  	anotherMatrix.put(5);
  	anotherMatrix.put(6);
  	anotherMatrix.put(2);
  	anotherMatrix.put(8);
  	anotherMatrix.put(9);

  	Matrix expectedMtx = new Matrix(2 ,3);
  	expectedMtx.put(13);
  	expectedMtx.put(25);
  	expectedMtx.put(11);
  	expectedMtx.put(22);
  	expectedMtx.put(18);
  	expectedMtx.put(15);

  	Matrix resultMtx = matrix.addWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  	assertTrue(expectedMtx.equals(resultMtx));
  }
  @Test
  public void addition_test_for_negative_mtx() {
  	Matrix matrix = new Matrix(2,3);
  	matrix.put(-10);
  	matrix.put(20);
  	matrix.put(-5);
  	matrix.put(20);
  	matrix.put(10);
  	matrix.put(-6);

  	Matrix anotherMatrix = new Matrix(2,3);
  	anotherMatrix.put(3);
  	anotherMatrix.put(5);
  	anotherMatrix.put(6);
  	anotherMatrix.put(2);
  	anotherMatrix.put(8);
  	anotherMatrix.put(9);

  	Matrix expectedMtx = new Matrix(2 ,3);
  	expectedMtx.put(-7);
  	expectedMtx.put(25);
  	expectedMtx.put(1);
  	expectedMtx.put(22);
  	expectedMtx.put(18);
  	expectedMtx.put(3);

  	Matrix resultMtx = matrix.addWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  	assertTrue(expectedMtx.equals(resultMtx));
  }

  
  @Test
  public void multiplication_test_for_2_by_2_and_2_by_2_matrix() {
  	Matrix matrix = new Matrix(2,2);
  	matrix.put(1);
  	matrix.put(2);
  	matrix.put(2);
  	matrix.put(1);

  	Matrix anotherMatrix = new Matrix(2,2);
  	anotherMatrix.put(2);
  	anotherMatrix.put(1);
  	anotherMatrix.put(1);
  	anotherMatrix.put(2);

  	Matrix expectedMtx = new Matrix(2 ,2);
  	expectedMtx.put(4);
  	expectedMtx.put(5);
  	expectedMtx.put(5);
  	expectedMtx.put(4);

  	Matrix resultMtx = matrix.multiplyWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  	assertTrue(expectedMtx.equals(resultMtx));
  }  
  
  @Test
  public void multiplication_test_for_2_by_3_and_3_by_2_matrix() {
  	Matrix matrix = new Matrix(2,3);
  	matrix.put(1);
  	matrix.put(2);
  	matrix.put(3);
  	matrix.put(4);
  	matrix.put(5);
  	matrix.put(6);

  	Matrix anotherMatrix = new Matrix(3,2);
  	anotherMatrix.put(7);
  	anotherMatrix.put(8);
  	anotherMatrix.put(9);
  	anotherMatrix.put(10);
  	anotherMatrix.put(11);
  	anotherMatrix.put(12);

  	Matrix expectedMtx = new Matrix(2 ,2);
  	expectedMtx.put(58);
  	expectedMtx.put(64);
  	expectedMtx.put(139);
  	expectedMtx.put(154);

  	Matrix resultMtx = matrix.multiplyWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  	assertTrue(expectedMtx.equals(resultMtx));
  }  
  @Test
  public void multiplication_test_for_3_by_2_and_2_by_3_matrix() {
  	Matrix matrix = new Matrix(3,2);
  	matrix.put(1);
  	matrix.put(2);
  	matrix.put(3);
  	matrix.put(4);
  	matrix.put(5);
  	matrix.put(6);

  	Matrix anotherMatrix = new Matrix(2,3);
  	anotherMatrix.put(7);
  	anotherMatrix.put(8);
  	anotherMatrix.put(9);
  	anotherMatrix.put(10);
  	anotherMatrix.put(11);
  	anotherMatrix.put(12);

  	Matrix expectedMtx = new Matrix(3 ,3);
  	expectedMtx.put(27);
  	expectedMtx.put(30);
  	expectedMtx.put(33);
  	expectedMtx.put(61);
  	expectedMtx.put(68);
  	expectedMtx.put(75);
  	expectedMtx.put(95);
  	expectedMtx.put(106);
  	expectedMtx.put(117);

  	Matrix resultMtx = matrix.multiplyWith(anotherMatrix);
  	assertTrue(resultMtx.equals(expectedMtx));
  	assertTrue(expectedMtx.equals(resultMtx));
  }

  @Test
  public void diterminent_of_2_by_2(){
  	Matrix matrix = new Matrix(2,2);
  	matrix.put(-5);
  	matrix.put(-4);
  	matrix.put(3);
  	matrix.put(2);		
  	assertEquals(matrix.calculateDiterminent(), 2);
  }
  @Test
  public void diterminent_of_2_by_2_for_0(){
  	Matrix matrix = new Matrix(2,2);
  	matrix.put(1);
  	matrix.put(2);
  	matrix.put(0);
  	matrix.put(0);		
  	assertEquals(matrix.calculateDiterminent(), 0);
  }

  @Test
  public void diterminent_of_4_by_4(){
  	Matrix matrix = new Matrix(4,4);
  	matrix.put(-5);
  	matrix.put(-4);
  	matrix.put(3);
  	matrix.put(2);		
  	matrix.put(6);
  	matrix.put(9);
  	matrix.put(-2);
  	matrix.put(5);
  	matrix.put(-1);
  	matrix.put(9);
  	matrix.put(-9);
  	matrix.put(-2);
  	matrix.put(8);
  	matrix.put(3);
  	matrix.put(7);
  	matrix.put(6);
  	assertEquals(matrix.calculateDiterminent(), -1155);
  }
}