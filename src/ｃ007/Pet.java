package ｃ007;
<<<<<<< HEAD

/**
 * ペットクラスを作成する
 *
 * @author jie
 *
 */
public class Pet {
	String name;
	int age;
=======
/**
 * ペットを作成するクラス
 * @author linjie
 *
 */
public class Pet {
	public String name;
	public int age;

	public String getName() {
		return name;
	}

	Pet() {

	};

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
>>>>>>> 8b18cc27c06ac1e260fa5b34d351a6978c82a71f

}
