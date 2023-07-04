package Melisa2;
public class MainClass {

	public static void main(String[] args){
		
		System.out.println("Hello");
		
		String name = ("John");
		int sumResult = helloSum(name, 20 ,30);
		int sum = helloFunction(name, 20, 30);
		//System.out.println("The value of sum is :" +sumResult);
		System.out.println(sum);
		String temp = (userName(name));
		System.out.println(temp + " and it has " + temp.length() + " Characters ");
		
	}
	
	public static int helloFunction(String name, int a , int b ) {
		
		int sum = a+b;
		
		System.out.println("Hello " + name + "!");
		
		return sum;
		
	} 
	
	  public static void Hello(String name, int a , int b) {
		int sum = a + b;
		System.out.println("Salutare" + name + "!" +"\n" +String.valueOf(sum));
	
	
	} 
	
	public static int helloSum(String name, int a, int b) {
		
		
		int sum = a+b;
		System.out.println("Hello "+ name + "!" );
		
		return sum; 
	}
	
	public static String userName (String name) {
		String ret ="Your name is " + name;
		return ret;
	}
}
