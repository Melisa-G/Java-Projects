package Melisa5;

import java.util.Scanner;
import java.io.PrintStream;

public class mainClass {
	String inputByUser = "This input was given by a user";
	PrintStream out = new PrintStream(System.out);
	
void start() {
	
	Scanner in = new Scanner(inputByUser);
	String savedInput = in.nextLine();
	out.println(savedInput);
}
	

	public static void main(String[]args) {
		
	new mainClass().start();
		
		
}
	
	}

