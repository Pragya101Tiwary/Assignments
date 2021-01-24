// Exercise 4

import java.util.Scanner;
// import java.util.Collections;
import java.util.Arrays;
public class Exercise4{
	
	private static int[] modifyArray(int[] numArr){
		Arrays.sort(numArr);
		int prev=numArr[0];
		for(int i=1; i<numArr.length; i++){
			if(numArr[i]==prev)
				numArr[i]=-1;
			else
				prev=numArr[i];
		}
		return numArr;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of the array:  ");
		int n=sc.nextInt();
		if(n>0){
			int[] numArr=new int[n];
			for(int i=0; i<n; i++)
				numArr[i]=sc.nextInt()*-1;
			numArr=modifyArray(numArr);
			for(int i=0; i<n; i++)
				if(numArr[i]!=-1)
					System.out.print("\n\t" + numArr[i]*-1);
		}
	}
}