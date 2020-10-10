package ｃ007;

/**
 * 2D配列に配列加算をする
 * @param inputArray
 * @return
 */
public class Matrix_1 {
	public static void main(String[] args) {

		int[][] array2d = new int[][] { { 16, 82, 64 }, { 4, 8, 74 } };
		int[] array = new int[] { 5, 8, 2 };
		int[][] addArray2d = getArray2d(array2d, array);
		outPutArray2d(addArray2d);
	}

	/**
	 * 2d配列に配列を加算する
	 * @param inputArray2d
	 * @param inputArray
	 * @return inputArray2d
	 */
	public static int[][] getArray2d(int[][] inputArray2d, int[] inputArray) {
		for (int x = 0; x < inputArray2d.length; x++) {
			for (int y = 0; y < inputArray2d[x].length; y++) {
				inputArray2d[x][y] = inputArray2d[x][y] + inputArray[y];
			}
		}
		return inputArray2d;
	}

	/**
	 * 2d配列をプリントする
	 * @param inputArray2d
	 */
	public static void outPutArray2d(int[][] inputArray2d) {
		for (int x = 0; x < inputArray2d.length; x++) {
			for (int y = 0; y < inputArray2d[x].length; y++) {
				System.out.print(inputArray2d[x][y] + " ");
			}
			System.out.println();
		}
	}

}
