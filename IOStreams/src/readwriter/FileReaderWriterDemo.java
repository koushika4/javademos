package readwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReaderWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\\\javafsd\\\\test\\\\test.txt");
		FileWriter fw = new FileWriter("C:\\\\javafsd\\\\testwriter\\\\testwriter.txt");
		
		int ch;
		while ( (ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}


}
