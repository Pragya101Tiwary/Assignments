// Exercise 7

import java.util.Scanner;
public class Exercise7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		if(checkNumber(sc.nextInt()))
			System.out.println("Yes, it is an INCREASING number.");
		else
			System.out.println("No, it is NOT an INCREASING number.");			
	}	
}