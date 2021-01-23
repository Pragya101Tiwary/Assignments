// Exercise 5

import java.util.Scanner;
public class Exercise5{
	
	private static int calculateSum(int n){
		int sum=0;
		for(int i=3, j=0; i>0 && j<n; i++){
			if(i%3==0 || i%5==0){
				sum+=i;
				j++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(calculateSum(sc.nextInt()));
	}
}