package src.main.java;
import java.io.IOException;


public class Petr {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Text InputString=new Text();
		String str = InputString.FirstString;
	    Word ArrayWord=new Word(str);

        //Индекс
        Sewtence Conditions=new Sewtence();

        Conditions.replaceCharAt(ArrayWord.words); 
        System.out.println( Conditions.concat(Conditions.NewString));
        
	}

}
