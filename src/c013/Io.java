package c013;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Io {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\Users\\user\\Desktop\\Book\\pet.csv");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;
			int lowId=0;

			while((line = bufferedReader.readLine())!=null) {

				if(lowId==0) {
					lowId++;
				}else {
					System.out.println(line);
				}
			}
			reader.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
