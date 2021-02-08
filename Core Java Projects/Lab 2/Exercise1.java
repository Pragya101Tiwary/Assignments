// Exercise 1

import java.util.Scanner;
import java.util.Arrays;
public class Exercise1{
	
	private static int getSecondSmallest(int[] numberArray){
		//Arrays.sort(numberArray);
		Arrays<Integer> ar = new ArrayList<Integer>(numberArray);
		Arrays.sort(numberArray);
		return numberArray[1];
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of the integer array:  ");
		int n = sc.nextInt();
		if(n<2){
			System.out.println("\n\t\tThe array must contain atleast 2 elements!");
		}
		else{
			int[] numberArray = new int[n];
			System.out.println("\nNow enter the elements of the integer array:\n");
			for(int i=0; i<n; i++){
				numberArray[i] = sc.nextInt();
			}
			System.out.println("\nThe second smallest element of the given array is:\n\n\t\t" + getSecondSmallest(numberArray));
		}
		sc.close();
	}
}