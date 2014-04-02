package tests;

import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		SelectorProvider pro = SelectorProvider.provider();
		SocketChannel channel = pro.openSocketChannel();
		channel.configureBlocking(false);
//		channel.register(sel, ops)
		Selector selector = pro.openSelector();
		channel.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
		
	}
	
	
	
	public static void test(int i){
		System.out.println(i);
	}
}
