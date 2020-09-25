package c005;

/**
 *質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 * @author linjie
 *
 */
public class Toi_04 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };
		System.out.println("重複する要素は");
		//配列をアクセスする
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array.length; y++) {
				//同じインデックスを除く
				if (x == y) {
					continue;
				}
				//同じ値を取る
				if (array[x] == array[y]) {
					System.out.print(array[x]+" ");
				}
			}
		}
	}

}
