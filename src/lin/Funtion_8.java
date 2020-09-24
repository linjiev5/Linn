package lin;

/**
 * 質問８︓バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。

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

	public static int[] bubbleSort(int[] sort1) {
		for (int x = 0; x <= sort1.length; x++) {
			for (int y = x + 1; y <= sort1.length - 1; y++) {
				//より小さい値を記録する
				if (sort1[x] > sort1[y]) {
					int temp = sort1[x];
					sort1[x] = sort1[y];
					sort1[y] = temp;
				}
			}
		}
		return sort1;
	}
}
