import java.io.*;
class FileMethodsExample{
	public static void main(String args[]){
		File f = new File  (args[1]);
		try{
		System.out.println(f.createNewFile());
		}
		catch(IOException io){
		}
		System.out.println(f.exists());
		if (f.exists() == true){
			System.out.println(f.getName());
		}

		System.out.println(f.isFile());
		System.out.println(f.getPath());
		System.out.println(f.isHidden());
		System.out.println(f.isAbsolute());
		System.out.println(f.length());
		System.out.println(f.getParent());
		System.out.println(new java.util.Date(f.lastModified()));
		
	}
}		