package lin;
/**
 *
 * @author linjie
 *
 */
public class Funtion_60 {

	public static void main(String[] args) {
	}

	public static void printArray(char[] aa) {
		if (aa == null) {
			System.out.println("bb");
			return;
		}
			 String prefix = "";
			 StringBuilder sb = new StringBuilder();
			 sb.append("[");
			 for(Object obj : aa) {
			 sb.append(prefix);
			 sb.append(String.valueOf(obj));
			 prefix = ", ";
			 }
			 sb.append("]");
			 System.out.println(sb.toString());
			}

	}


