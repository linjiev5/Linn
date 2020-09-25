package c005;

public class Toi_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		設問２︓5の階乗を求める(for)。
		int kaiJyou = 1;
		for (int x = 5; x >= 1; x--) {
			kaiJyou = kaiJyou * x;
		}
		System.out.println("5の階乗は" + kaiJyou);
	}

}
