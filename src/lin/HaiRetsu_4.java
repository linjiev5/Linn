package lin;

public class HaiRetsu_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		問題７︓⾏列（２次元配列）の和と積を計算してください。
		int[][] array2d = new int[][] { { 1, 2, 3, 4 }, { 21, 22, 23, 24 } };
		int sum = getSum(array2d);
		System.out.println("２次元配列の和は" + sum);
		int product = getProduct(array2d);
		System.out.println("２次元配列の積は" + product);
	}

	public static int getSum(int[][] array2d) {
		int sum = 0;
		for (int x = 0; x < array2d.length; x++) {
			for (int y = 0; y < array2d.length; y++) {
				sum = sum + array2d[x][y];
			}
		}
		return sum;
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
