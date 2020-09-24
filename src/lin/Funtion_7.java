package lin;

/**
 * 質問７︓以下静的なメソッドを定義してください。
1. メソッド名︓trim
2. 引数１︓charの配列
3. 戻り値︓charの配列
4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
// メソッドを実施後
char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
 * @author linjie
 *
 */
public class Funtion_7 {

	public static void main(String[] args) {
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		char[] output = trim(input);
		for (char element : output) {
			System.out.print(element);
		}
	}

	/**
	 *
	 * @param input1	入力する配列
	 * @return	空白文字列を削除した配列
	 */
	public static char[] trim(char[] input1) {
		int startIndex = 0, length = 0;
		//頭から入力した配列をアクセスする
		for (int i = 0; i < input1.length; i++) {
			//空白でなインデックスの値を取る
			if (input1[i] != ' ') {
				startIndex = i;
				break;
			}
		}
		//後ろから入力した配列をアクセスする
		for (int j = input1.length - 1; j >= 0; j--) {
			//空白でないインデックスの値をとる
			if (input1[j] != ' ') {
				length = j - 1;
				break;
			}
		}
		//
		char[] input2 = subArray(input1, startIndex, length);
		return input2;
	}

	/**
	 *
	 * @param array1入力した配列
	 * @param startIndex
	 * @param length1
	 * @return　新しい配列
	 *
	 */
	public static char[] subArray(char[] array1, int startIndex, int length1) {
		char[] array2 = new char[length1];
		//		入力した配列の位置と新しい配列の位置の合わせ
		for (int i = 0, j = startIndex; i < length1; j++, i++) {
			array2[i] = array1[j];
		}
		return array2;
	}
}
