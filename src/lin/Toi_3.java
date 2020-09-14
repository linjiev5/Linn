package lin;

public class Toi_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = getMax(array);
		System.out.println("最大値は" + max);
		int min = getMin(array);
		System.out.println("最小値は" + min);
		int sum = getSum(array);
		System.out.println("和は" + sum);
		int average = getAverage(array);
		System.out.println("平均値は" + average);
	}

	public static int getMax(int[] array) {
		int maxIndex = 0;
		for (int x = 1; x < array.length; x++) {
			if (array[x] > array[maxIndex]) {
				array[maxIndex] = array[x];
			}
		}
		return array[maxIndex];
	}

	public static int getMin(int[] array) {
		int minIndex = 0;
		for (int y = 1; y < array.length; y++) {
			if (array[y] < array[minIndex]) {
				array[minIndex] = array[y];
			}
		}
		return array[minIndex];
	}

	public static int getSum(int[] array) {
		int sumIndex = 0;
		for (int i = 1; i < array.length; i++) {
			array[sumIndex] = array[sumIndex] + array[i];
		}
		return array[sumIndex];
	}

	public static int getAverage(int[] array) {
		int averageIndex = 0;
		for (int j = 1; j < array.length; j++) {
			array[averageIndex] = array[averageIndex] + array[j];
		}
		array[averageIndex] = array[averageIndex] / array.length;
		return array[averageIndex];
	}
}