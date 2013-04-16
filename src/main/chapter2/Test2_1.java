package chapter2;

import java.io.IOException;
import java.io.OutputStream;

import org.junit.Test;

public class Test2_1 {
	
	/**
	 * If you pass a number larger than 255 or smaller than 0, <br/>
	 * it's reduced modulo 256 before being written.
	 */
	@Test
	public void writeTest() throws IOException{
		OutputStream out = System.out;
		for(int i=0;i<=255;i++){
			out.write(i);
			out.write(i+256);
			System.out.println();
		}
	}
	
	@Test
	public void ASCIIChar(){
		for (int i = 32; i < 127; i++) {
			System.out.write(i);
			// break line after every eight characters.
			if (i % 8 == 7)
				System.out.write('\n');
			else System.out.write('\t');
		}
		System.out.write('\n');
	}

}
