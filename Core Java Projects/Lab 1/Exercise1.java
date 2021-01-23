// Exercise 1

import java.lang.Math;
import java.util.Scanner;
public class Exercise1{
	
	private static void sumCubeDigits(int number){
		int sum = 0;
		while(number!=0){
			sum += (int)Math.pow((number%10), 3);
			number/=10;
		}
		System.out.println("Sum of the cube of digits of the entered number is:  " + sum);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if(n1>0)
			sumCubeDigits(n1);
	}
}
