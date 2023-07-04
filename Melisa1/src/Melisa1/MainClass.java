package Melisa1;
import java.util.Scanner;
import java.util.Random;
public class MainClass {
	
	
	public static void main(String[] args){
		
		
		
	Scanner scanner = new Scanner(System.in);
	scanner.useDelimiter(System.getProperty("line.separator"));
	System.out.println("Cum te numesti " + "?" );
	String n1 = scanner.next();
	System.out.println("Buna " + n1 + "!");
	System.out.println("Ce job iti doresti  " + "?" );
	String n2 = scanner.next();
	System.out.println("In cat timp crezi ca poti obtine acest job"  + "?" );
	String n3 = scanner.next();
	System.out.println("Care sunt pasii pe care trebuie sa-i urmezi pentru a te putea angaja  " + "?" );
	String n4 = scanner.next();
	System.out.println("De cand	doresti sa incepi  " + "?" );
	String n5 = scanner.next();
	System.out.println("Deci sa recapitulam sa ne asiguram ca am inteles bine.");
	System.out.println("Deci te numesti " + n1 + " si doresti sa lucrezi ca si " + n2 + " Crezi ca " + n3 + " vor fi suficiente pentru a obsine ascest job " + " Dar mai ai nevoie de " + n4 + " Si ai putea incepe " + n5 );
	System.out.println("Am inteles bine? " );
	String n = scanner.next();
	System.out.println("Ok atunci, hai sa incepem! ");
	scanner.close();
	
		
		 String str = "lupul", reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
	//THIS EXERCISE I DO NOT FIND THE LOGIC YET.!!!!
		    }
		
		
		int suma = 0;
		int a = 1;
		
		for(int i=0; i<=100; i++) {
			
			suma += a+i;
		}
		
		System.out.println("Suma este: " + suma);
		
	
		// Dinamizeaza programul prin adaugarea optiunii de introducere a celor 2 numere (nr.
		//de inceput si cel de sfarsit) de la tastatura, de la punctul anterior
		
		int suma1=0;
		int a1=1;
		int i=0;
		int b=1;
		
		while(i<=100) {
			
			suma1 += a1+i + --b;
			i++;
			
		}
		System.out.println("Suma este:" + suma1);
	
			
		/*Scanner scanner1 = new Scanner(System.in);
		scanner1.useDelimiter(System.getProperty("line.separator"));
		

		String piatra ="Piatra";
		String hartie ="Hartie";
		String foarfeca ="Foarfeca";
		
		System.out.println("Piatra,Foarfeca,Hartie?");
		String x = scanner1.next();
		System.out.println("Piatra,Foarfeca,Hartie?");
		String y = scanner1.next();
		
		if(piatra==piatra || hartie==hartie || foarfeca==foarfeca) {
			System.out.println("Este remiza !Incearca din nou!" + x + y);
			
		}
		
		else if(hartie==piatra && piatra==foarfeca && foarfeca==hartie ) {
			System.out.println("Felicitari, ai castigat" + x + y);
			
		}
		
		else if(piatra==foarfeca || foarfeca == piatra || hartie==foarfeca) {
			
			System.out.println("Ai pierdut" + x + y);
			
		} 
				
		Random rand = new Random();
	    int plm = rand.nextInt(3);
	    String[] variante = {"piatra", "foarfeca", "hartie"};
	    
        joc(variante[plm]);
        scanner1.close();
	    
	}
	
	public static boolean isValid(String user) {

	    if ((user.equalsIgnoreCase("piatra")) || (user.equalsIgnoreCase("foarfeca")) || (user.equalsIgnoreCase("hartie")))    return true;
	    else  return false;
	}
	
	public static void joc(String calculator){
	    Scanner scan = new Scanner(System.in);
	    String sc = scan.next();
	    
	    if (isValid(sc)) {
	       System.out.println(sc.toLowerCase() + " vs. " + calculator);
           if (sc.equalsIgnoreCase(calculator)) System.out.println("Ba esti nebun ? Egalitate!");
           else castigator(calculator, sc);
           System.out.println("Va rugam introduceti piatra, foarfeca sau hartie!");
	    }

	    else System.out.println("Va rugam introduceti piatra, foarfeca sau hartie!");
	    scan.close();
	}
	
	public static boolean castigator(String calculator, String user){
	    
	    if (((user.equalsIgnoreCase("piatra")) && (calculator == "foarfeca")) ||
	       ((user.equalsIgnoreCase("foarfeca")) && (calculator == "hartie")) ||
	       ((user.equalsIgnoreCase("hartie")) && (calculator == "piatra"))) {
	           System.out.println("Ai castigat !");
	           return true;
	       }
	       
	       else {
	           System.out.println("Ai pierdut !");
	           return false;
	       }
		
	}*/
	}
}
