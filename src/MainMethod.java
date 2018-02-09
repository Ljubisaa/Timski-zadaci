
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

	// Stefan
	public static double sumColumn(double[][] m, int columnIndex) {
		double a = 0;
		return a;
	}

	// Dino
	public static void sort(int m[][]) {

	}
	// Dino

}
