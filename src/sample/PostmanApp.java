package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import dynacode.DynaCode;
import dynacode.DynaCode2;

public class PostmanApp {

	public static void main(String[] args) throws Exception {
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));

		Postman postman = getPostman();

		while (true) {
			Thread.sleep(5000) ;
			System.out.print("Enter a message: ");
			String msg = sysin.readLine();

			postman.deliverMessage(msg);
		}
	}

	private static Postman getPostman() {
		System.out.println(System.getProperty("java.io.tmpdir"));
		DynaCode2 dynacode = new DynaCode2();
		dynacode.addSourceDir(new File("dynacode"));
		return (Postman) dynacode.newProxyInstance(Postman.class,
				"sample.PostmanImpl");
	}

}
