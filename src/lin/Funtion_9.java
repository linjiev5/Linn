package lin;

/**
 * 質問９︓メソッドの呼び出す練習。
1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください。
 * @author linjie
 *
 */
public class Funtion_9 {

	public static void main(String[] args) {
		int[] array = new int[] { 456, 213, 874, 21 };
		int[] array1 = new int[] { 84, 894, 9, 32 };
		int[] array2 = Funtion_61.megerArray(array, array1);
		for (int element : array2) {
			System.out.print(element + " ");
		}
		System.out.println();
		int[] array0 = Funtion_8.bubbleSort(array2);
		for (int element : array0) {
			System.out.print(element + " ");
		}
	}
}
