package lin;

/**
 * 配列のすべての要素の和を求める
 * @author linjie
 *
 */
public class Funtion_hanyou {

	public static void main(String[] args) {
		int[] leftArray = new int[] { 1, 2, 3 };
		int[] rightArray = new int[] { 5, 6, 7 };
		int sum = getSum(leftArray, rightArray);
		System.out.print(sum + " ");
	}

	/**
	 *
	 * @param getLeftArray:一つ目の配列を入力する
	 * @param getRightArray:二つ目の配列を入力する
	 * @return	sumValue:配列の要素を合わせた値
	 */
	public static int getSum(int[] getLeftArray, int[] getRightArray) {
		int sumLeftArray = 0, sumRightArray = 0;
		for (int i = 0; i < getLeftArray.length; ++i) {
			//配列内すべての要素を合わせる
			sumLeftArray = sumLeftArray + getLeftArray[i];
		}
		for (int i = 0; i < getRightArray.length; ++i) {
			//配列内すべての要素を合わせる
			sumRightArray = sumRightArray + getRightArray[i];
		}
		//二つの配列を合わせた値の合計
		int sumValue = sumLeftArray + sumRightArray;
		return sumValue;
	}
}
