import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class inputStream {

	public static void main(String[] args) {
		
		try {
			FileInputStream file=new FileInputStream("D:\\file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not available");
		}
		
	}

}
