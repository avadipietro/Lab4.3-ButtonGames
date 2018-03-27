import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
	
public class BackEnd {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File("highScores.csv")));
			System.out.println("File succesfully read! :)\n");
			in.append("3");
			String line = in.readLine();
			while (line != null) {
				String[] scores = line.split(",");
				for (String num : scores) {
					System.out.println(num);
				}
				line = in.readLine();
			}
		}
		catch (IOException ee) {
			System.out.println("IO EXCEPTION !! :(");
		}
	}
}
