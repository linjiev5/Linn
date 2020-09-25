package c005;

public class Toi_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		質問５︓質問３の配列に値「７」のインデックスを求む
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int x = 0; x < array.length; x++) {
			if (array[x] == 7) {
				System.out.println(x);
			}
		}
	}
}
