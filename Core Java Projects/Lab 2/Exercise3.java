// Exercise 3

import java.util.Scanner;
import java.lang.StringBuffer;
public class Exercise3{
	
	private static int[] getSorted(int[] numArr){
		StringBuffer sb = new StringBuffer();
		sb.append(numArr[0]);
		numArr[0]=Integer.parseInt(sb.reverse().toString());
		for(int i=1; i<numArr.length; i++){
			sb.replace(0, sb.length(), String.valueOf(numArr[i]));
			numArr[i]=Integer.parseInt(sb.reverse().toString());
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

	// public static void main(String[] args){
		// Scanner sc = new Scanner(System.in);
		// System.out.print("\n Enter the size of Integer Array:   ");
		// int n = sc.nextInt();
		// int[] numArr = new int[n];
		// if(n>0){
			// StringBuffer sb = new StringBuffer(sc.next());
			// numArr[0]=Integer.parseInt(sb.reverse().toString());
			// for(int i=1; i<n; i++){
				// sb.replace(0,sb.length(),(sc.next()));
				// numArr[i]=Integer.parseInt(sb.reverse().toString());
			// }
			// java.util.Arrays.sort(numArr);
			// for(int i=0; i<n; i++)
				// System.out.print("\t" + numArr[i] + "\n");
		// }
	// }