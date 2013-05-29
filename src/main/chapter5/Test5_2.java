package chapter5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Test5_2 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java MailClient username@host.com");
			return;
		}
		try {
			URL u = new URL("mailto:" + args[0]);
			URLConnection uc = u.openConnection();
			uc.setDoOutput(true);
			uc.connect();
			OutputStream out = uc.getOutputStream();
			for (int c = System.in.read(); c != -1; c = System.in.read()) {
				out.write(c);
			}
			out.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}
