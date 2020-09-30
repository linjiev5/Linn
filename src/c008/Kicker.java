package c008;

public class Kicker {


	public static void print(Child v) {
		v.hello();
	}
	public static void print(Parent a) {
		a.hello();
	}
	public static void main(String... args) {
		print(new Parent());
		print(new Child());
	}
}
