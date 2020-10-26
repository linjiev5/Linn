package thread;

public class Ticket {

	private int num = 100;

	public void sale() {

		while(true) {
			if(num>0) {
				System.out.println(num--);
			}
		}
	}

}
