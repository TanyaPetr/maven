package src.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sewtence {
	
	public static int num;
	public  static String replace;
	public static String[] NewString;
	Sewtence() throws IOException {

		
	        BufferedReader ReaderforInt = new BufferedReader(new InputStreamReader(System.in));
	       BufferedReader ReaderforSymbol = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Замена введите индекс: ");
	         num = Integer.parseInt(ReaderforInt.readLine());
	     
	         System.out.println("Замена введите символ для замены: ");
	         replace = ReaderforSymbol.readLine();

	    }
	public static String[] replaceCharAt(String ArrayWords[]) {
		NewString=new String[ArrayWords.length];
		for(int NumberWords=0;NumberWords<ArrayWords.length;NumberWords++){	
			if(ArrayWords[NumberWords].length()<num){
				
				NewString[NumberWords]=ArrayWords[NumberWords];
			}
			else{
				NewString[NumberWords]=new String(ArrayWords[NumberWords].substring(0,num-1) + replace + ArrayWords[NumberWords].substring(num));
				
			}
		
		}
		   return NewString;
		}
	
	public static String concat(String ArrayWords[]) {
		String temp="";
		for(int NumberWords=0;NumberWords<ArrayWords.length;NumberWords++){
			temp+=ArrayWords[NumberWords] +" ";
		}
		   return temp;

		}
	


}
