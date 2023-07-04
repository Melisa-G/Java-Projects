package Melisa4;

import java.util.Scanner;

public class mainClass {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cat ai imprumutat?");
		int amount = scanner.nextInt();
		System.out.println("Cat ai platit?");
		int payment0 = scanner.nextInt();
		int count = 1;
		
		
		
		
		int rent = amount / 10; // 20000-18000 = 2000;
		int remainingAmount = amount - rent;//18000 o mai ramas
		int payment1 = remainingAmount / 10; // s-o platit 1800(10& din 18000)
		
		

		int remainingAmount2 = remainingAmount - payment1;//16200 o mai ramas
		int payment2 = remainingAmount2 / 10; //-1620 s-o platit 1620(10% din 16200)
		
		int remainingAmount3 =  remainingAmount2 - payment2 ;// = 14580 o mai ramas
		
		
		
		do
		{
			System.out.println( "Mai ai  " + remainingAmount + " de platit.");
			count++;
			System.out.println("Cat ai platit?");
			int paymenta = scanner.nextInt();
			System.out.println( "Mai ai  " + remainingAmount2 + " de platit.");
			count++;
			System.out.println("Cat ai platit?");
			int paymentb = scanner.nextInt();
			System.out.println( "Mai ai  " + remainingAmount3 + " de platit.");
			
			count++;
			
			
		} while (count<=3);
	
		scanner.close();

	}
	
	
}

