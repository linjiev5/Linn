package ｃ007;

/**
 *配列を処理する
 * @author linjie
 *
 */
public class Math {
	public static void main(String[] args) {
		int[] array = new int[] { 154, 21, 654, 231, 564 };
		int max = getArrayMax(array);
		System.out.println("配列の最大値は" + max);
		int min = getArrayMin(array);
		System.out.println("配列の最小値は" + min);
		int average = getArrayAverage(array);
		System.out.println("配列の平均値は" + average);
	}

	/**
	 * 配列の最大値を求める
	 * @param inputArray
	 * @return inputArray[maxIndex]
	 */
	public static int getArrayMax(int[] inputArray) {
		int maxIndex = 0;
		for (int x = 1; x < inputArray.length; x++) {
			if (inputArray[maxIndex] < inputArray[x]) {
				inputArray[maxIndex] = inputArray[x];
			}
		}
		return inputArray[maxIndex];
	}

	/**
	 *配列の最小値を求める
	 * @param inputArray
	 * @return inputArray[minIndex]
	 */
	public static int getArrayMin(int[] inputArray) {
		int minIndex = 0;
		for (int x = 1; x < inputArray.length; x++) {
			if (inputArray[minIndex] > inputArray[x]) {
				inputArray[minIndex] = inputArray[x];
			}
		}
		return inputArray[minIndex];
	}

	/**
	 * 配列の平均値を求める
	 * @param inputArray
	 * @return average
	 */
	public static int getArrayAverage(int[] inputArray) {
		int sum = 0;
		for (int x = 0; x < inputArray.length; x++) {
			sum = inputArray[x] + sum;
		}
		int average = sum / inputArray.length;
		return average;
	}
}