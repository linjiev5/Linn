package ｃ007;

/**
 * ペットの作成と名前、年齢をプリンアウトする
 * @author linjie
 *
 */
public class TestPet {

	public static void main(String[] args) {
		Pet cat = new Pet("cat", 2);
		outPut(cat);
		Pet dog = new Pet("dog", 5);
		outPut(dog);
	}

	/**
	 * ペットの名前と年齢をプリントする
	 * @param petName
	 */
	public static void outPut(Pet petName) {
		Pet pet = new Pet();
		pet = petName;
		System.out.println("ペットの名前は" + pet.name + "ペットの年齢は" + pet.age);
	}
}
