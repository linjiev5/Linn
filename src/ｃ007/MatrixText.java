package ｃ007;

public class MatrixText {

	public static  void main(String[] args) {
		int[][] inputArray2d=new int[][] {{458,748,321},{548,564,986}};
		int[] inputArray=new int[] {45,87,21};
//		Matrix array2d=new Matrix(inputArray2d);
		outPutArray2d(getArray2d(inputArray2d,inputArray));
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
