package c008;

public class Parent {
	public String famaliName;
	private String giveName;
	protected int money;

	public void helloName() {
		System.out.println("私の名前は" + famaliName);
	}
	public void hello() {
		System.out.println("parent method");
		 }
	public String getGiveName() {
		return giveName;
	}
	public void setGiveName(String giveName) {
		this.giveName = giveName;
	}
}
