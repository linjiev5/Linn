package lin;

/**
 * ２つ配列をマージする。
 *マージした配列をソートする。
 * @author linjie
 *
 */
public class Funtion_9 {

	public static void main(String[] args) {
		int[] leftArray = new int[] { 456, 213, 874, 21 };
		int[] rightArray = new int[] { 84, 894, 9, 32 };
		//２つ配列をマージするメソッドを呼び出す
		int[] megerArray = Funtion_61.megerArray(leftArray, rightArray);
		for (int element : megerArray) {
			System.out.print(element + " ");
		}
		System.out.println();
		//配列をソートするメソッドを呼び出す
		int[] bubbleSort = Funtion_8.bubbleSort(megerArray);
		for (int element : bubbleSort) {
			System.out.print(element + " ");
		}
	}
}
