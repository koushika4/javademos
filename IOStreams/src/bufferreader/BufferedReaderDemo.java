package bufferreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
	
	
public static void main(String[] args) throws IOException {
	
	FileReader fr = new FileReader("C:\\javafsd\\test\\test.txt");
	BufferedReader br = new BufferedReader(fr);
	String line;
	int count = 0;
	while ( (line = br.readLine()) != null) {
		StringTokenizer st = new StringTokenizer(line);
		count += st.countTokens();
	}
	br.close();
	fr.close();
	
	System.out.println("count of words in the file = " + count);
}

}
