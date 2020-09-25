package c006;

/**
 * 重⼒加速度を計算する
 * @author user
 *
 */
public class Test0923 {

	public static void main(String[] args) {
		System.out.println(gAcceleration(2.0F));
	}

	/**
	 *重⼒加速度を計算する
	 * @param t : 入力した数値の計算
	 * @return ｙ
	 */
	public static float gAcceleration(float t) {
		float y = 1;
		float g = 9.8F;
		//加速度の計算式
		y = g * t * t / 2 * (g = 9.8F);
		return y;
	}
}
