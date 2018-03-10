import java.io.*;

public class ShowFile {
	public static void main(String args[]) throws IOException {
		try {
			new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: ShowFile File");
			return;
		}
	}
}