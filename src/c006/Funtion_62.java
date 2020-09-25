package c006;

/**
 *サブ配列を取得処理
 * @author linjie
 *
 */
public class Funtion_62 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4 };
		int start = 1, length = 2;
		int[] result = subArray(array, start, length);
		for (int element : result) {
			System.out.print(element + " ");
		}
		//int[] result = new int[] {2, 3};
	}

	/**
	 *サブ配列の処理
	 * @param array入力した配列
	 * @param startIndex
	 * @param getLength
	 * @return　getArray
	 *
	 */
	public static int[] subArray(int[] array, int startIndex, int getLength) {
		int[] getArray = new int[getLength];
		//		入力した配列の位置と新しい配列の位置の合わせ
		for (int i = 0, j = startIndex; i < getLength; j++, i++) {
			getArray[i] = array[j];
		}
		return getArray;
	}
}
