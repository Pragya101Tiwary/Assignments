// Exercise 2

import java.util.regex.*;
import java.util.Scanner;
public class Exercise2{
	public static void main(String[] args){
		String fullName = new Scanner(System.in).nextLine();
			
		try{
			if(Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE).matcher(fullName).find() || fullName.trim().isEmpty() || fullName==null)
				throw new BlankNameException("Please check the name!");
		}
		catch(BlankNameException bn){
			System.out.println("InvalidName");
			bn.printStackTrace();
		}
	}
}

class BlankNameException extends Exception{
	public BlankNameException(){
		super("First name and last name is blank.\nPlease provide your full name.");
	}
	public BlankNameException(String str){
		super(str);
	}
}