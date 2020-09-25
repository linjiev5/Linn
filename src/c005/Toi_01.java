package c005;
/**
 *設問１︓1から100までの偶数の和を求める(for + if)。
 * @author linjie
 *
 */
public class Toi_01 {

	public static void main(String[] args) {
		//結果を保存する
		int sum = 0;
		//1から100までの数字を出す
		for (int x = 1; x <= 100; x++) {
			//2に割り切れない数字を除く
			if (x % 2 != 0) {
				continue;
			}
			//	足し算を計算する
			sum = sum + x;
		}
		System.out.println("1から100までの偶数の和は" + sum);
	}

}
