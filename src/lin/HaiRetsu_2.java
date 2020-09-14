package lin;

public class HaiRetsu_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
//		System.out.println()。
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = getMax(array);
		System.out.println("最大値は" + max);
		int min = getMin(array);
		System.out.println("最小値は" + min);
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
}
