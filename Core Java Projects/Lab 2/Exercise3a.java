// Exercise 3

import java.util.Scanner;
import java.lang.StringBuffer;
public class Exercise3a{
	
	private static int[] getSorted(int[] numArr){
		StringBuffer[] sb = new StringBuffer[numArr.length];
		for(int i=0; i<numArr.length; i++){
			
			// sb[i]=new StringBuffer(numArr[i] + ""); OR
			sb[i]=new StringBuffer(String.valueOf(numArr[i]));
			// but not:
			// sb[i]=String.valueOf(numArr[i]);
			// sb[i].append(String.valueOf(numArr[i]));
			
			numArr[i]=Integer.parseInt(sb[i].reverse().toString());
			
		}
		java.util.Arrays.sort(numArr);
		return numArr;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\tEnter the size of the integer array:  ");
		int n=sc.nextInt();
		if(n>0){
			int[] numArr=new int[n];
			for(int i=0; i<n; i++){
				numArr[i]=sc.nextInt();
			}
			numArr=getSorted(numArr);
			System.out.println("\n\tHere's the sorted list with numbers reversed:\n");
			for(int i=0; i<n; i++)
				System.out.print("\t" + numArr[i] + "\n");
		}
	}
}