package c009;

public class Dog implements IPet {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void eat(String food) {
		System.out.println(name + " eat " + food);

	}

	public static void main(String[] args) {

		Dog wangcai = new Dog("wangcai");
		wangcai.eat("meat");
	}

}
