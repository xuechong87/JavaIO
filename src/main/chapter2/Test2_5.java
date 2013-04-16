package chapter2;

import java.io.IOException;
import java.io.OutputStream;

import org.junit.Test;

public class Test2_5 {
	
	@Test
	public void testNullInput() throws IOException{
		OutputStream out = new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				System.out.println(b);
			}
		};
		byte[] input = null;
		out.write(input);
	}
}
