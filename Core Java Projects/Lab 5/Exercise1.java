// Exercise 1

import java.util.Scanner;
public class Exercise1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try{
			if(age<=15)
				throw new AgeInvalidException();
		}
		catch(AgeInvalidException ae){
			System.out.println("Invalid age! " + age);
		}
		finally{
			System.out.println("Your age is: " + age);
		}
	}
}

class AgeInvalidException extends Exception{
	public AgeInvalidException(){
		super("Sorry you do not meet our minimum age requirement, i.e., 16 years.");
	}
}