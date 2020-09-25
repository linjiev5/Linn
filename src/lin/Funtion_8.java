package lin;

/**
 *bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートする
 * @author linjie
 *
 */
public class Funtion_8 {

	public static void main(String[] args) {
		int[] array = new int[] { 51, 84, 12, 874, 65 };
		int[] sort = bubbleSort(array);
		for (int element : sort) {
			System.out.print(element + " ");
		}
	}

	/**
	 *配列をソートする
	 * @param getArray任意int型の配列を入力
	 * @return	getArray
	 */
	public static int[] bubbleSort(int[] getArray) {
		for (int x = 0; x <= getArray.length; x++) {
			for (int y = x + 1; y <= getArray.length - 1; y++) {
				//より小さい値を記録する
				if (getArray[x] > getArray[y]) {
					int temp = getArray[x];
					getArray[x] = getArray[y];
					getArray[y] = temp;
				}
			}
		}
		return getArray;
	}
}
