package c005;
/**
 *質問６︓任意⾏列（２次元配列）の積を求める。
 * @author linjie
 *
 */
public abstract class Toi_06 {

	public static void main(String[] args) {
		int[][] array2d = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		//積の値を１に乗する
		int seKi = 1;
		for (int x = 0; x < array2d.length; x++) {
			for (int y = 0; y < array2d.length; y++) {
				//繰り返し積をかける
				seKi = seKi * array2d[x][y];
			}
		}
		System.out.println(seKi);
	}

}
