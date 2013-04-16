package chapter1;

import java.io.Console;

import org.junit.Test;

/**
 * the  test of Chapter1.7.5
 * @author xuechong
 */
public class Test1_7_5 {
	
	/**
	 * 这个方法不能在Eclipse中正常运行<br/>
	 * 你需要在控制台中用命令行运行测试<br/>
	 * 因为在Eclipse中JVM是由后台自动启动,所以Console会为null<br/>
	 * <br/>
	 * If the virtual machine is started from an interactive command line without<br/>
	 * redirecting the standard input and output streams then its console will exist and<br/> 
	 * will typically be connected to the keyboard and display from which the virtual<br/>
	 * machine was launched.If the virtual machine is started automatically, for example by<br/>
	 * a background job scheduler, then it will typically not have a console.<br/>
	 * @author xuechong
	 */
	public void promptTest(){
		Console console = System.console();
		String prompt = "input some thing:";
		String s = console.readLine("%s",prompt);
		System.out.println("result is :" +s);
	}
	
	@Test
	public void printfTest(){
		  for (double degrees = 0.0; degrees < 360.0; degrees++) {
		    double radians = Math.PI * degrees / 180.0;
		    double grads = 400 * degrees / 360;
		    System.out.printf("%5.1f %5.1f %5.1f\n", degrees, radians, grads);
		  }
	}
	
}
