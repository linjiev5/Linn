package lin;

/**
 *質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
 * @author linjie
 *
 */
public class Toi_07 {

	public static void main(String[] args) {
		int[] array = new int[] { 5, 80, 7, 2, 165, 484 };
		System.out.println("元の配列は");
		hyouJi(array);
		syouJyon(array);
		System.out.println();
		System.out.println("昇順の配列は");
		hyouJi(array);
	}

	/**
	 *
	 * @param array配列をプリントする
	 */
	public static void hyouJi(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 *
	 * @param array　配列を昇順にする
	 */
	public static void syouJyon(int[] array) {
		for (int x = 0; x < array.length - 1; x++) {
			for (int y = x + 1; y < array.length; y++) {
				//位置転換する
				if (array[x] > array[y]) {
					int temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}
			}
		}

	}
}
