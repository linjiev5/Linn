package lin;

/**
 *
1. メソッド名:

2. 引数１︓intの配列 left
3. 引数２︓intの配列 right
4. 戻り値︓intの配列
5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
以下メソッドの実施例︓
int[] left = new int[] {1, 2, 3, 4};
int[] right = new int[] {5, 6, 7, 8};
// メソッドを実施後
int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
 * @author linjie
 *
 */
public class Funtion_61 {

	public static void main(String[] args) {
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] result1 = megerArray(left, right);
		for (int element : result1) {
			System.out.print(element + " ");
		}
	}

	public static int[] megerArray(int[] l, int[] r) {
		int length1 = l.length + r.length;
		int[] result = new int[length1];
		for (int x = 0; x < length1; x++) {
			//leftの配列のインデックスを指定する
			for (int a = 0; x < l.length; a++, x++) {
				result[x] = l[a];
			}
			//rightの配列のインデックスを特定する
			if (x > l.length - 1) {
				for (int b = 0; b < r.length; x++, b++) {
					result[x] = r[b];
				}
			}
		}
		return result;
	}
}
