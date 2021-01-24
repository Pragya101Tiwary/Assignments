// Exercise 2

import java.util.Arrays;
public class Exercise2{
	
	private static String sortStrings(String[] stringArray){
		Arrays.sort(stringArray);
		int mid=0;
		if((stringArray.length-1)/2==0)
			mid=(stringArray.length-1)/2;
		else
			mid=(stringArray.length-1)/2+1;
		for(int i=0; i<mid; i++)
			stringArray[i]=stringArray[i].toUpperCase();
		return Arrays.toString(stringArray);
	}
	
	public static void main(String[] args){
		System.out.println(sortStrings(new java.util.Scanner(System.in).nextLine().toLowerCase().split(" ")));
	}
}