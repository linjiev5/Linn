package lin;

public class Toi_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問５︓質問３の配列に値「７」のインデックスを求む。
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int x = 0; x < array.length; x++) {
			if (array[x] == 7) {
				System.out.println("配列の値は「7」のインデックスは" + x);
			}
		}
	}

}
