package c005;

/**
 *設問２︓5の階乗を求める(for)。
 * @author linjie
 *
 */
public class Toi_02 {

	public static void main(String[] args) {
		//階乗の結果を保存する
		int kaiJyou = 1;
		//５から１までの整数を出す
		for (int x = 5; x >= 1; x--) {
			//階乗の計算式
			kaiJyou = kaiJyou * x;
		}
		System.out.println("5の階乗は" + kaiJyou);
	}

}
