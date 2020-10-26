package c006;

/**
 *配列先頭と末尾の空⽩⽂字列の削除処理。
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
	 *両端の空白文字列を削除した配列の処理
	 * @param getInput	入力する配列
	 * @return	setInput
	 */
	public static char[] trim(char[] getInput) {
		int startIndex = 0, endIndex = 0;
		//頭から入力した配列をアクセスする
		for (int i = 0; i < getInput.length; i++) {
			//空白でなインデックスの値を取る
			if (getInput[i] != ' ') {
				startIndex = i;
				break;
			}
		}
		//後ろから入力した配列をアクセスする
		for (int j = getInput.length - 1; j >= 0; j--) {
			//空白でないインデックスの値をとる
			if (getInput[j] != ' ') {
				endIndex = j - 1;
				break;
			}
		}
		//サブ配列を取得する
		char[] setInput = subArray(getInput, startIndex, endIndex);
		return setInput;
	}

	/**
	 *サブ配列の処理,配列と配列のインデックスの始末を入力すればサブ配列がアウトプットできる
	 * @param getArray入力した配列
	 * @param startIndex
	 * @param length
	 * @return	setArray
	 *
	 *
	 */
	public static char[] subArray(char[] getArray, int startIndex, int length) {
		char[] setArray = new char[length];
		//		入力した配列の位置と新しい配列の位置の合わせ
		for (int i = 0, j = startIndex; i < length; j++, i++) {
			setArray[i] = getArray[j];
		}
		return setArray;
	}
}
