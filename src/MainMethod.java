import java.lang.reflect.Array;
import java.util.Arrays;

public class MainMethod {

	public static void main(String[] args) {

		int[] a = { 1, 5, 6, 7, 8, 1};

		if (isSorted(a)) {
			System.out.println("Niz je sortiran.");
		} else {
			System.out.println("Niz nije sortiran.");
		}

		eliminateDuplicates(a);

		for (int i = 0; i < eliminateDuplicates(a).length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int[] eliminateDuplicates(int[] arr) {

		int end = arr.length;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (arr[i] == arr[j]) {

					arr[j] = arr[end - 1];
					end--;
					j--;
				}
			}
		}

		int[] whitelist = new int[end];

		System.arraycopy(arr, 0, whitelist, 0, end);
		return whitelist;

	}

	public static boolean isSorted(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}

		}

		return true;
	}

	public static String sort(String s) {
		return s;
	}

	// Stefan
	public static double sumMajorDiagonal(double[][] m) {
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
