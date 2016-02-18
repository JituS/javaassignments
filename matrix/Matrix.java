package matrix;

import java.util.Arrays;
public class Matrix{
	private int[][] matrix;
	public Matrix(int m, int n){
		int[][] matrix = new int[m][n];
		this.matrix = matrix;		
	};

	public void populate(int number, int m, int n){
		this.matrix[m][n] = number;
	};

	public int[][] addMatrices(int[][] matrix1){
		int[][] result = new int[matrix1.length][matrix1[0].length];
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[i].length;j++){
				result[i][j] = matrix1[i][j] + this.matrix[i][j];
			};
		};
		return result;
	};
	public String string(){
		String str = "";
		for (int i = 0;i < this.matrix.length ;i++ ) {
			str += Arrays.toString(this.matrix[i])+"\n";
		}
		return str;
	}
	// public int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2){
	// 	int[][] result = new int[matrix1.length][matrix2[0].length];
	// 	for (int i = 0;i < matrix1.length ;i++ ) {
	// 		for(int j = 0; j < matrix1[i].length; j++){
	// 			for (int k = 0;k < matrix2.length ;k++) {
	// 				for (int l = 0;l < matrix2[k].length ;l++) {
	// 					int 
	// 				}
	// 			}
	// 		}
	// 	}
	// 	int product = 
	// };
}