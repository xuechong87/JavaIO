package chapter4;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

import utils.StreamCopier;

public class Test4_1 {

	@Test
	public void copyFileToSysOut() {
		try {
			typeFile("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void typeFile(String filename) throws IOException {
		FileInputStream fin = new FileInputStream(filename);
		try {
			StreamCopier.copy(fin, System.out);
		} finally {
			fin.close();
		}
	}
}
