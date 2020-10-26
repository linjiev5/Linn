package ｃ007;

/**
 *人間のクラスを作成する
 * @author linjie
 *
 */
public class Human {
	public String name;
	protected int age;
	private int money;

	public Human() {
		name = "lin";
	}
	public String getNman() {
		return name;
	}

	public void setName(String name) {
	}

	public void sleep() {

	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
