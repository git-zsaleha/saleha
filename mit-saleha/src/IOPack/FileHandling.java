package IOPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileHandling {
	 public static void main(String[] args) throws Exception {
		 File file=new File("newfile.txt");
		 System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		FileInputStream fis=new FileInputStream("newfile.txt");
		
		FileReader fr=new FileReader("newfile.txt");
		 
	}

}
