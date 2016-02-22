package src.main.java;

import java.io.IOException;

public class Word {
	String[] words;
	Word(String FirstString) throws IOException {
		words = FirstString.split(" ");
	    }

}
