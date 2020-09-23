package lin;
/**
 *
 * @author linjie
 *
 */
public class Toi_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };
		int getMax = getMax(array);
		System.out.println("配列の最大値は" + getMax);
		int getMin = getMin(array);
		System.out.println("配列の最小値は" + getMin);
		int getSum = getSum(array);
		System.out.println("配列の和は" + getSum);
		int heiKin = heiKin(array);
		System.out.println("配列の平均値は" + heiKin);
	}
/**
 *
 * @param array 平均値を計算するメソッドを作る
 * @return　平均値
 */
	public static int heiKin(int[] array) {
		int sum = getSum(array);
		getSum(array);
		int heiKin = sum / array.length;
		return heiKin;
	}
/**
 *
 * @param array　足し算ができるメソッドを作る
 * @return　和の値
 */
	public static int getSum(int[] array) {
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			array[sum] = array[sum] + array[i];
		}
		return array[sum];
	}
/**
 *
 * @param array　最小値を取るメソッドを作成する
 * @return　最小値
 */
	public static int getMin(int[] array) {
		int min = 0;
		for (int y = 1; y < array.length; y++) {
			if (array[min] > array[y]) {
				array[min] = array[y];
			}
		}
		return array[min];
	}
/**
 *
 * @param array　最大値を取るメソッドを作成する
 * @return　最大値
 */
	public static int getMax(int[] array) {
		int max = 0;
		for (int x = 1; x < array.length; x++) {
			if (array[max] < array[x]) {
				array[max] = array[x];
			}
		}
		return array[max];
	}
}