package Melisa3;

import java.util.Scanner;


public class MainClass {


public static void main (String[]args) {
	
 /*	int n = 125586;

	System.out.println("Last digit of the number " + n + " is " + lastDigit(n));
	
	double sum = zeroFunction(9.00, 8.01, 21.21);
	System.out.println(sum);
	
	

 1. Scrie o functie care primeste 3 parametri de tip real. Functia va returna 1 daca suma
celor trei parametri formeaza un numar natural (aka, valoare fixa, fara virgula) si 0 in rest.
Testeaza aceasta functie cu urmatoarele valori de intrare:
4.67, 8.93, 10.00
51.24, 33.10, 1.66
9.00, 8.01, 21.21

public static double zeroFunction( double a, double b , double c ) {
	
	double sum = a + b + c ;
		
	if(sum%2==0) {
		
		System.out.println("1");		
	} else		
		System.out.println("0");
	
	return sum; 



	 Scrie o functie care returneaza ultima cifra a unui numar natural. De exemplu, daca
numarul este 234, functia va returna 4.


	public static int lastDigit(int n) {
	
				return (n % 10);
		} 
		*/

	// Cand iti cere un site ca sa confirmi codul setat de tine anterior

	Scanner scanner = new Scanner(System.in);
    int password=8819;

  do {
      System.out.println("Write password");
      password=scanner.nextInt();
     
  } while (password != 8819);
  
  System.out.println("Please confirm your password!");
  password=scanner.nextInt();
  
  
  		if(password == 8819) {
  			
  			System.out.println("you're in!");
  			
  		}
  
scanner.close();
    
}

}





	
	



	






