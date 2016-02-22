package src.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text {
	public String FirstString;
	Text() throws IOException {

	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("¬ведите текст: ");
	        FirstString = reader.readLine();

	    }
	
}
