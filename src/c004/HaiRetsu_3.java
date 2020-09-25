package c004;

public class HaiRetsu_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		問題６︓問題１の配列のSUMを求める。
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int sum = getSum(array);
		System.out.println("配列の和は" + sum);
	}

	public static int getSum(int[] array) {
		int sumIndex = 0;
		for (int x = 1; x < array.length; x++) {
			array[sumIndex] = array[sumIndex] + array[x];
		}
		return array[sumIndex];
	}
}
