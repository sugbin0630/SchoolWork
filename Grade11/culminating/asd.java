package Grade11.culminating;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class asd {
	public static void main(String[] args) {
		try {
			BufferedWriter wr = new BufferedWriter(new FileWriter("new.txt"));

			boolean play_With = true;
			wr.write(String.valueOf(play_With));

			wr.close();
		} catch (IOException e) {

		}
	}
}