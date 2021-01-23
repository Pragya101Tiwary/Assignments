// Exercise 7

import java.util.Scanner;
public class Exercise7{
	
	private static boolean checkNumber(int number){
		if(number>0){
			int prevNo=-2147483648;
			prevNo = number%10;
			number/=10;
			while(number!=0){
				if(number%10>prevNo){
					return false;
				}
				prevNo = number%10;
				number/=10;
			}
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		if(checkNumber(sc.nextInt()))
			System.out.println("Yes, it is an INCREASING number.");
		else
			System.out.println("No, it is NOT an INCREASING number.");			
	}	
}