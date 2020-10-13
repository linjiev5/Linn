package c009;

public class Cat implements IPet {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public void eat(String food) {
		System.out.println(this.name + " eat " + food);
	}

	public static void main(String[] args) {
		Cat mimi = new Cat("mimi");
		mimi.eat("fish");
	}
}
