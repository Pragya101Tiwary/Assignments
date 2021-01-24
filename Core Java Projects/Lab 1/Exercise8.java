// Exercise 8

import java.util.Scanner;
public class Exercise8{
	
	private static boolean checkNumber(int n){
		switch(n%10){
			case 0:
			case 2:
			case 4:
			case 6:
			case 8:
				return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		if(checkNumber(sc.nextInt()))
			System.out.println("YES, it is a power of '2'");
		else
			System.out.println("NO, it is not a power of '2'");			
	}
}