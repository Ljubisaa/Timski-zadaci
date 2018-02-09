import java.lang.reflect.Array;
import java.util.Arrays;

public class MainMethod {

	public static void main(String[] args) {
		int[][] matrix;
		matrix = generateMatrix(5);
		printMatrix(matrix);
		System.out.println();
		sort(matrix);
		printMatrix(matrix);

	}

	public static int[] eliminateDuplicates(int[] list) {
		return list;
	}
    
	public static boolean isSorted(int[] list) {
		return true;
	}
	public static String sort(String s){
		return s;
	}
	//Stefan
	public static double sumMajorDiagonal(double[][] m){
		double sum = 0;
		return sum;
	}
	//Stefan

	public static double sumColumn(double[][] m, int columnIndex){
		double columnSum = 0;
		for (int i = 0 ; i < m.length ; i++) {
			columnSum += m[i][columnIndex];
		}
		return columnSum;
	}
	//Dino
	public static void sort(int m[][]){
		int[] tmp;
		for (int i = 0 ; i < m.length ; i++) {
			tmp = m[i];
			Arrays.sort(tmp);
		}
		for (int i = 0 ; i < m.length - 1 ; i++) {
			for (int j = i ; j < m.length ; j++) {
				if (m[i][0] > m[j][0]) {
					tmp = m[i];
					m[i] = m[j];
					m[j] = tmp;
				}
			}
		}
	}
	//Dino
	//This is for testing purposes only
	public static int[][] generateMatrix(int numOfRowsAndColumns) {
		int[][] matrix = new int[numOfRowsAndColumns][numOfRowsAndColumns];
		for (int i = 0 ; i < numOfRowsAndColumns ; i++) {
			for (int j = 0 ; j < numOfRowsAndColumns ; j++) {
				matrix[i][j] = (int)(Math.random()*100);
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0 ; i < matrix.length ; i++) {
			for (int j = 0 ; j < matrix[i].length ; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
