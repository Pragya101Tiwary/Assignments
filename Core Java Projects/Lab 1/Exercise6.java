// Exercise 6

import java.util.Scanner;
import java.lang.Math;
public class Exercise6{
	
	private static int calculateDifference(int n){
		int sum=0, sum1=0, sum2=0;
		for(int i=1; i<n+1; i++){
			sum1+=(int)Math.pow(i, 2);
			sum2+=i;
		}
		sum2=(int)Math.pow(sum2, 2);
		sum = sum2>sum1?sum2-sum1:sum1-sum2;
		return sum;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(calculateDifference(sc.nextInt()));
	}
}

// 7

// 1,	   2,	  3,	  4,	  5,	  6,	  7

// 1^2  + 2^2  + 3^2  +  4^2  +  5^2  +  6^2  +  7^2  =  140

// (1   +   2   +   3   +   4   +   5   +   6   +   7)^2  =  784

// 644