package chapter2;

import org.junit.Test;

public class Test2_3 {
	
	
	@Test
	public void closeSystemOut(){
		System.out.close();
		try {
			System.out.println("aaaa");
		} catch (Exception e) {
			//no ex will throw 
			System.err.println(e.toString());
		}
		Boolean b = System.out.checkError();
		System.err.println(b);
	}
}
