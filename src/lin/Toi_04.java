package lin;

public class Toi_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array.length; y++) {
				if (x == y) {
					continue;
				}
				if (array[x] == array[y]) {
					System.out.println(array[x]);
				}
			}
		}
	}

}
