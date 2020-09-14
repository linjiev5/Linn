package lin;

public class Toi_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		int[] array = new int[] { 5, 9, 35, 47, 24, 12 };
		printArray(array);
		sort(array);
		printArray(array);
	}

	public static void printArray(int[] array) {
		System.out.print("[");
		for (int p = 0; p < array.length; p++) {
			if (p != array.length - 1) {
				System.out.print(array[p] + ",");
			} else
				System.out.println(array[p] + "]");
		}
	}

	public static void sort(int[] array) {
		for (int x = 0; x < array.length - 1; x++) {
			for (int y = x + 1; y < array.length; y++) {
				if (array[x] > array[y]) {
					int temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}
			}
		}

	}

}
