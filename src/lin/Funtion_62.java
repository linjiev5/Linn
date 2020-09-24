package lin;

/**
 * 質問６-２︓以下静的なメソッドを定義してください。
1. メソッド名: subArray
2. 引数１︓intの配列 array
3. 引数２︓開始のstartIndex
4. 引数３︓⻑さlength
5. 戻り値︓intの配列
6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
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
	 *
	 * @param array1入力した配列
	 * @param startIndex
	 * @param length1
	 * @return　新しい配列
	 *
	 */
	public static int[] subArray(int[] array1, int startIndex, int length1) {
		int[] array2 = new int[length1];
		//		入力した配列の位置と新しい配列の位置の合わせ
		for (int i = 0, j = startIndex; i < length1; j++, i++) {
			array2[i] = array1[j];
		}
		return array2;
	}
}
