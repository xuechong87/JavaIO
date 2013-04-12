package chapter3;

import java.io.IOException;

import org.junit.Test;

public class Test3_1 {

	@Test
	public void byteToint(){
		//unsigned to signed
		for (int i = 0 ;i<=255;i++) {
			System.out.print((byte)i);
			System.out.print("=");
			System.out.println(i < 128 ? i : i - 256);
		}
		//signed to unsigned
		for(byte b = Byte.MIN_VALUE;b<=Byte.MAX_VALUE;b++){
			System.out.println(b >= 0 ? b : 256 + b);
			if(b==Byte.MAX_VALUE){break;}
		}
	}
	@Test
	public void printInput(){
		try {
			while (true) {
				int datum = System.in.read( );
				if (datum  == -1) break;
				System.out.println(datum);
			}
		}
		catch (IOException ex) {
			System.err.println("Couldn't read from System.in!");
		}
	}
	
}
