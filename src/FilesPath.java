import java.io.File;
import java.io.IOException;
class FilesPath{
	public static void main(String[] args) {
		File currentDir = new File(args[0]); 
		displayDirectoryContents(currentDir);
	}
	public static void displayDirectoryContents(File dir) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("directory:" + file.getAbsolutePath());
				displayDirectoryContents(file);
				}
				 else {
					System.out.println("file:" + file.getAbsolutePath());
			}
		}
	 }
}