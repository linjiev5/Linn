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
	 *空白文字列を削除した配列の処理
	 * @param getInput	入力する配列
	 * @return	setInput
	 */
	public static char[] trim(char[] getInput) {
		int startIndex = 0, length = 0;
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
				length = j - 1;
				break;
			}
		}
		//
		char[] setInput = subArray(getInput, startIndex, length);
		return setInput;
	}

	/**
	 *サブ配列の処理
	 * @param getArray入力した配列
	 * @param startIndex
	 * @param getLength
	 * @return	setArray
	 *
	 */
	public static char[] subArray(char[] getArray, int startIndex, int getLength) {
		char[] setArray = new char[getLength];
		//		入力した配列の位置と新しい配列の位置の合わせ
		for (int i = 0, j = startIndex; i < getLength; j++, i++) {
			setArray[i] = getArray[j];
		}
		return setArray;
	}
}
