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
		int[][] array2d = new int[high][high];
		for (int x = 0; x < high; x++) {
			for (int y = 0; y <= x; y++) {
				if (x == y || y == 0) {
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
