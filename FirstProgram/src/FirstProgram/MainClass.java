package FirstProgram;

public class MainClass {
	
	public static void main(String[] args) {

		
	/* 1.) Creeaza cate o variabila de tipul: string, int si float, dupa cum urmeaza:
	Variabila de tip unsigned int va retine valoarea 20
	Variabila de tip int va retine valoarea -5
	Variabila de tip float va retine valoarea 8.73
	Variabila de tip String retine valoarea “Java”
	Variabila de tip String retine valoarea “Imi place programarea in ”
	Variabila de tip String retine valoarea “ pentru ca suma acestor 2 numere este: ”
	Variabila de tip char retine valoarea “!”
	Avand aceste variabile, afiseaza pe ecran un mesaj (care sa aiba cat de cat sens :D ) cu
	acestea.*/
	 
	 	int a = 20;
		int b = -5;
		float c = 8.73f;
		String d = "Java";
		String e = "Imi place programarea in :";
		String f = "pentru ca suma acestor 2 numere este :";
		char g = '!';
		
		int sum = a+b;
		System.out.println("Am dreptate ! " + f + sum + g );
		System.out.println(" Imi dedic " + c + "% din timp pentru a invata  pentru ca " + e + " Java!" );
	
		
		// Acesta este un exercitiu, nu se vede in program . Deblocheaza daca merge!
	
		
		// 2. ) Scrie un program care calculeaza valoarea pentru urmatoarele variabile de tip float :
		
	  
	    float x = -7 + 4/3*5;
		float y = -7 +4/(3*5);
		float z =(-7 + 4/3)*5;
		
		System.out.println("Valoarea lui x este : " + x);
		System.out.println("Valoarea lui y este : " + y);
		System.out.println("Valoarea lui z este : " + z);
		
	   
		// Daca se schimba din float in int atunci rezultatul o sa fie fara ".0" la final. 
		
		int nota = 0;
		switch(nota) {
		 case 10:
		 System.out.println("Excelent!");
		 break;
		 case 8:
		 System.out.println("Bravo");
		 case 7:
		 System.out.println("Te-ai descurcat bine");
		 break;
		 case 5:
		 System.out.println("Ai trecut");
		 break;
		 case 2:
		 System.out.println("Ai picat. Mai incearca");
		 break;
		 default:
		 System.out.println("Nota nu a fost introdusa corect");
		}
		
		/*3.) Creeaza un program care determina daca un numar (introdus de la tastatura) este par
sau impar. Se va afisa (print) in terminal un mesaj similar cu: "Numarul introdus X este
par", in cazul in care numarul este par, iar "Numarul nu este par" in rest.
PS: un numar este par daca se poate imparti la 2. Exemplu (2, 4, 8, 24150, etc.)*/
		
		
		int m = 13;
		
		if ( m % 2 == 0) {
		
		System.out.println(" Rezultat : numarul este par");
		}
		else {
		
		System.out.println(" Rezutat : numarul este impar!");
		}
		
	}
}
