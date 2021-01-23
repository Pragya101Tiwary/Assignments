// Exercise 2

import java.util.Scanner;
public class Exercise2{
	
	private static void checkAndDisplay(int x){
		switch(x){
			case 1:
				System.out.println("\n         ______   _______   ______    ______\n        |            |     |      |  |      |  |\n        |            |     |      |  |      |  |\n        |______      |     |______|  |______|  |\n               |     |     |      |  |         |\n               |     |     |      |  |         |\n         ______|     |     |______|  |         o\n");
				break;
			case 2:
				System.out.println("\n         ______    ______   ______    _____\n        |      |  |        |      |  |     \\   |      |  |\n        |      |  |        |      |  |      |  |      |  |\n        |______|  |_____   |______|  |      |  |______|  |\n        |    \\    |        |      |  |      |      |     |\n        |     \\   |        |      |  |      |      |     |\n        |      \\  |______  |      |  |_____/       |     o\n");
				break;
			case 3:
				System.out.println("\n         ______    ______\n        |         |      |  |\n        |         |      |  |\n        |   ___   |      |  |\n        |      |  |      |  |\n        |      |  |      |  |\n        |______|  |______|  o\n");
				break;
		}
	}
	
	public static void main(String[] args){
		System.out.println(" Choose from the following options:\n____________________________________\n");
		System.out.println("Press '1' for selecting Red Traffic Light.\nPress '2' for selecting Yellow Traffic Light.\nPress '3' for selecting Green Traffic Light.\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter here:  ");
		checkAndDisplay(sc.nextInt());
	}
}