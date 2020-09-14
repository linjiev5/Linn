package lin;

/**
 * @author linjie
 *
 */
public class Toi_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		質問８︓LV10のパスカルの三⾓形を出⼒してください。
		int high = 10;
		int[][] array2d = new int[high + 1][high + 1];
		for (int x = 1; x < high + 1; x++) {
			for (int y = 1; y <= x; y++) {
				if (x == y || x == 0) {
					array2d[x][y] = 1;
				} else {
					array2d[x][y] = array2d[x - 1][y - 1] + array2d[x - 1][y];
				}
				System.out.print(array2d[x][y] + "\t");
			}
			System.out.println();
		}
	}
}
