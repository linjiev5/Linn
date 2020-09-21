package lin;

public class Toi_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		設問１︓1から100までの偶数の和を求める(for + if)。
		int sum = 0;
		for (int x = 1; x <= 100; x++) {
			if (x % 2 != 0) {
				continue;
			}
			sum = sum + x;
		}
		System.out.println("1から100までの偶数の和は" + sum);
	}

}
