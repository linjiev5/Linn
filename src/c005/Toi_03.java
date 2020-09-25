package c005;

/**
 *質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * @author linjie
 *
 */
public class Toi_03 {

	public static void main(String[] args) {
		//配列を定義する
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };
		//最大値のメソッドを引用する
		int getMax = getMax(array);
		System.out.println("配列の最大値は" + getMax);
		//最小値のメソッドを引用する
		int getMin = getMin(array);
		System.out.println("配列の最小値は" + getMin);
		//和のメソッドを引用する
		int getSum = getSum(array);
		System.out.println("配列の和は" + getSum);
		//平均値のメソッドを引用する
		int heiKin = heiKin(array);
		System.out.println("配列の平均値は" + heiKin);
	}

	/**
	 *
	 * @param array 平均値を計算するメソッドを作る
	 * @return　平均値
	 */
	public static int heiKin(int[] array) {
		//和のメソッドで計算した値を利用する
		int sum = getSum(array);
		getSum(array);
		//平均値を計算する式
		int heiKin = sum / array.length;
		return heiKin;
	}

	/**
	 *
	 * @param array：足し算ができるメソッドを作る
	 * @return すべて配列のインデックスsum（合わせた）の値
	 */
	public static int getSum(int[] array) {
		//和を記録する，0から足し算を計上する
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			//インデックスsumを計上する
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
			//インデックスminとインデックスｙと比較する
			if (array[min] > array[y]) {
				//より小さい値を記録する
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
		//最大値を記録する
		int max = 0;
		for (int x = 1; x < array.length; x++) {
			//インデックスmaxとインデックスｘを比較する
			if (array[max] < array[x]) {
				//より大きい値を記録する
				array[max] = array[x];
			}
		}
		return array[max];
	}
}