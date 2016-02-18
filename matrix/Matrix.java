package matrix;

import java.util.Arrays;
public class Matrix{
	private int[][] matrix;
	private int rows;
	private int columns;

	public Matrix(int rows, int columns){
		this.columns = columns;
		this.rows = rows;
		this.matrix = new int[rows][columns];		
	};

	public void put(int number, int rowNo, int columnNo){
		if(rowNo <= this.rows && columnNo <= this.columns){
			this.matrix[rowNo][columnNo] = number;
		}
	};

	public Matrix addWith(Matrix addend){
		Matrix result = new Matrix(this.rows, this.columns);
		for(int i = 0; i < this.rows; i++){
			for(int j = 0; j < this.matrix[i].length;j++){
				result.put(addend.matrix[i][j] + this.matrix[i][j], i, j);
			};
		};
		return result;
	};

	public String toString(){
		String str = "";
		for (int i = 0;i < rows ;i++ ) {
			str += Arrays.toString(this.matrix[i])+"\n";
		}
		return str;
	}

	public boolean equals(Matrix anotherMtx){
		return Arrays.deepEquals(this.matrix, anotherMtx.matrix);
	}

	public Matrix multiplyWith(Matrix anotherMtx){
		Matrix result = new Matrix(this.rows, anotherMtx.columns);
		for (int i = 0;i < this.rows ;i++ ) {
			for(int j = 0;j < anotherMtx.columns; j++){
				int sum = 0;
				for(int k = 0;k < this.columns;k++){
					sum += this.matrix[i][k] * anotherMtx.matrix[k][j];
				}
				result.put(sum, i, j);
			}
		}
		return result;
	}
}



