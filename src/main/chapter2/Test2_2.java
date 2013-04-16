package chapter2;

import java.io.IOException;

import org.junit.Test;

public class Test2_2 {
	
	@Test
	public void arrWrite() throws IOException{
		String s = "How are streams treating you?";
		byte[] data = s.getBytes( );
		System.out.write(data);
	}
	
	@Test
	public void asciiArray(){
		byte[] b = new byte[(127-31)*2];
		int index = 0;
		for (int i = 32; i < 127; i++) {
		  b[index++] = (byte) i;
		  // Break line after every eight characters.
		  if (i % 8 == 7) b[index++] = (byte) '\n';
		  else b[index++] = (byte) '\t';
		}
		b[index++] = (byte) '\n';
		try {
		  System.out.write(b);
		}
		catch (IOException ex) {
		  System.err.println(ex);
		}
	}
	
}
