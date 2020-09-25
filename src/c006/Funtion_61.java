package c006;

import java.util.Arrays;

/**
 *二つの配列を融合する
 * @author linjie
 *
 */
public class Funtion_61 {

	public static void main(String[] args) {
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] result = megerArray(left, right);
		System.out.println(Arrays.toString(result));
	}
/**
 * 二つの配列を融合する
 * @param leftArray
 * @param rightArray
 * @return	result
 */
	public static int[] megerArray(int[] leftArray, int[] rightArray) {
		int length = leftArray.length + rightArray.length;
		int[] result = new int[length];
		for (int x = 0; x < length; x++) {
			//leftの配列のインデックスを指定する
			for (int a = 0; x < leftArray.length; a++, x++) {
				result[x] = leftArray[a];
			}
			//rightの配列のインデックスを特定する
			if (x > leftArray.length - 1) {
				for (int b = 0; b < rightArray.length; x++, b++) {
					result[x] = rightArray[b];
				}
			}
		}
		return result;
	}
}
