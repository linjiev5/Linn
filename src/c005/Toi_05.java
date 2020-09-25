package c005;
/**
 *質問５︓質問３の配列に値「７」のインデックスを求む。
 * @author linjie
 *
 */
public class Toi_05 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int x = 0; x < array.length; x++) {
			//値は７のインデックスを探す
			if (array[x] == 7) {
				System.out.println("配列の値は「7」のインデックスは" + x);
			}
		}
	}

}
