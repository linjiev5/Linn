package lin;

public class Toi_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		質問６︓任意⾏列（２次元配列）の積を求める。
		int[][] array2d = new int[][] { { 3, 5, 6, 7 }, { 4, 5, 8, 9 } };
		int result = getProduct(array2d);
		System.out.println(result);
	}

	public static int getProduct(int[][] array2d) {
		int product = 1;
		for (int x = 0; x < array2d.length; x++) {
			for (int y = 0; y < array2d.length; y++) {
				product = product * array2d[x][y];
			}
		}
		return product;
	}
}
