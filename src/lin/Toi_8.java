package lin;

/**
<<<<<<< HEAD
 * @author linjie
=======
 *
 * @author jie
>>>>>>> b962f04e27d548625d9665550a4d567d92995a41
 *
 */
public class Toi_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//		質問８︓LV10のパスカルの三⾓形を出⼒してください。
		int high = 10;
		int[][] array2d = new int[high + 1][high + 1];
		for (int x = 1; x < high + 1; x++) {
			for (int y = 1; y <= x; y++) {
				if (x == y || x == 0) {
=======
//		質問８︓LV10のパスカルの三⾓形を出⼒してください。
		int high = 10;
		System.out.println("レベル"+high+"のパスカル三角形は:");
		int[][] array2d = new int[high][high];
		for (int x = 0; x < high; x++) {
			for (int y = 0; y <= x; y++) {
				if (y == 0 || y == x) {
>>>>>>> b962f04e27d548625d9665550a4d567d92995a41
					array2d[x][y] = 1;
				} else {
					array2d[x][y] = array2d[x - 1][y - 1] + array2d[x - 1][y];
				}
<<<<<<< HEAD
				System.out.print(array2d[x][y] + "\t");
=======
				System.out.print(array2d[x][y] + " ");
>>>>>>> b962f04e27d548625d9665550a4d567d92995a41
			}
			System.out.println();
		}
	}
<<<<<<< HEAD
=======

>>>>>>> b962f04e27d548625d9665550a4d567d92995a41
}
