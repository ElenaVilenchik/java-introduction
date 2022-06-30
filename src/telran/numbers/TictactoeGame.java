package telran.numbers;

//import java.util.Arrays;

public class TictactoeGame {
	public static final char X = 'x';
	public static final char Z = '0';
	public static final char E = '1';

	public static int tictactoeMove(char matrix[][], int nRow, int nCol, char symb) {
		matrix[nRow][nCol] = symb;
		if (isColumnWin(matrix, nCol) || 
				isRowWin(matrix, nRow) || 
				isDiagonalstWin(matrix)) 
				{
			return 1;
		}
		if (isMatrixFull(matrix)) {
				return 3;
		}		
	 return 0;
	}
	
	public static boolean isMatrixFull(char matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == E) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isColumnWin(char matrix[][], int nCol) {
		for(int i = 1; i < matrix.length; i++) {
			if (matrix[i][nCol] != matrix[0][nCol]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isRowWin(char matrix[][], int nRow) {
		for(int i = 1; i < matrix.length; i++) {
			if (matrix[nRow][i] != matrix[nRow][0]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isDiagonalstWin(char matrix[][]){
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][i] != matrix[0][0]) {
				for (int j = 1; j < matrix.length; j++)
					if (matrix[j][matrix.length - 1 - j] != matrix[0][matrix.length -1]){
					return false;
					}
			}	
		}
		return true;
	}
}
