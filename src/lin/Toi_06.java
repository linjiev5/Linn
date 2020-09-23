package lin;
/**
 *
 * @author linjie
 *
 */
public abstract class Toi_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問６︓任意⾏列（２次元配列）の積を求める。
		int[][] array2d = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int seKi = 1;
		for (int x = 0; x < array2d.length; x++) {
			for (int y = 0; y < array2d.length; y++) {
				seKi = seKi * array2d[x][y];
			}
		}
		System.out.println(seKi);
	}

}
