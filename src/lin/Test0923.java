package lin;

/**
 * 実例︓重⼒加速度 y = g*t*t/2 は以下関数で定義する。
1. 引数 t, 型は float 型
2. 関数名は gAcceleration（先頭⽂字は半⾓英字設定必要があり）
3. 返却値は float 型
4. 関数の処理ロジック︓g*t*t/2 (g=9.8F)
 * @author user
 *
 */
public class Test0923 {

	public static void main(String[] args) {
		System.out.println(gAcceleration(2.0F));
	}

	/**
	 *
	 * @param t : 入力した数値の計算
	 * @return y:重力の加速度を返却する
	 */
	public static float gAcceleration(float t) {
		float y = 1;
		float g = 9.8F;
		//加速度の計算式
		y = g * t * t / 2 * (g = 9.8F);
		return y;
	}
}
