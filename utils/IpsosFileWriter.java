package utils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class IpsosFileWriter {

	BufferedWriter bw;
	
	public IpsosFileWriter(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		if (!file.isFile() && !file.exists()) {
			throw new FileNotFoundException("File not found: " + filePath);
		}
		try {
			bw = new BufferedWriter(new FileWriter(filePath));
		} catch (IOException e) {
			//Should never happen!
		}
	}
	
	public void write(String message) {
		 try {
			bw.write(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
