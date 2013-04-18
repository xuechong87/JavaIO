package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamCopier {
	public static void copy(InputStream in,OutputStream out) throws IOException{
		byte[] buffer = new byte[1024];
		while(true){
			int bytesRead = in.read(buffer);
			if(bytesRead==-1){
				break;
			}
			out.write(buffer,0,bytesRead);
			//out.write(buffer); if you do this ,thousand '0's will be write
		}
	}
	
	public static void main(String[] args) {
		try {
			copy(System.in, System.err);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
