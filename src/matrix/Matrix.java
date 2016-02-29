package matrix;
import java.util.Arrays;
public class Matrix{
	private int[][] matrix;
	private int rows;
	private int columns;
	private int currentRowPosition;
	private int currentColumnPosition;

	public Matrix(int rows, int columns){
		this.currentColumnPosition = 0;
		this.currentRowPosition = 0;
		this.columns = columns;
		this.rows = rows;
		this.matrix = new int[rows][columns];
	};

	public void put(int number){
		if(currentColumnPosition == this.columns){
			this.matrix[++currentRowPosition][0] = number;
			currentColumnPosition=1;
		}else{
			this.matrix[currentRowPosition][currentColumnPosition] = number;
			currentColumnPosition++;
		}
	};

	public Matrix addWith(Matrix addend){
        Matrix result = new Matrix(this.rows, this.columns);
		if(this.rows == addend.rows && this.columns == addend.columns ){
            for(int i = 0; i < this.rows; i++){
                for(int j = 0; j < this.matrix[i].length;j++){
                    result.put(addend.matrix[i][j] + this.matrix[i][j]);
                }
            }
        }
        return result;
	}

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
		if(this.columns == anotherMtx.rows){
            for (int i = 0;i < this.rows ;i++ ) {
                for(int j = 0;j < anotherMtx.columns; j++){
                    int sum = 0;
                    for(int k = 0;k < this.columns;k++){
                        sum += this.matrix[i][k] * anotherMtx.matrix[k][j];
                    }
                    result.put(sum);
                }
            }
        }
		return result;
	}

	private Matrix subMtx(int i){
		Matrix subMatrix = new Matrix(this.rows-1, this.columns-1);
		for(int j = 0;j < this.rows;j++){
			for(int k = 0;k < this.columns;k++){
				if(j!=0 && k!=i){
					subMatrix.put(this.matrix[j][k]);
				}
			};
		};
		return subMatrix;
	}

	private int determinant(int flag){
		if(this.rows == 2){
			return (flag % 2==0)
			? this.matrix[0][0] * this.matrix[1][1] - this.matrix[0][1] * this.matrix[1][0]
			: -(this.matrix[0][0] * this.matrix[1][1] - this.matrix[0][1] * this.matrix[1][0]);
		}
		int result = 0;
		for(int i = 0;i < this.rows;i++){
			result += this.matrix[0][i] * this.subMtx(i).determinant(flag++);
		};
		return result;
	}

	public int calculateDiterminent(){
        if(this.rows == this.columns)
		    return this.determinant(0);
        return -9999999;
	}
}



