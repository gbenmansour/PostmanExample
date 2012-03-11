package sample;

import java.io.*;

public class PostmanImpl implements Postman {

	private PrintStream output;
	
	public PostmanImpl() {  
		output = System.out;
	}
	  
	
//	public PostmanImpl() throws IOException {
//		output = new PrintStream(new FileOutputStream("msg.txt"));
//	}
//
	public void deliverMessage(String msg) {
		output.println("[Post] " + msg);
		output.flush();
	}
}
