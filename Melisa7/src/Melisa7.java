
import java.util.Scanner;

class Demo{
    static String isPrime(int number) 
    {
        String result = "";
        for (int i = 2; i <= number / 2; ++i) 
        {
            /* condition for non prime number,
               don't change condition*/
            if (number % i == 0) {
                result =  "Isn't prime";
                break;
            } else
            result = "Is prime"; 
        }
        return result;

    }

    public static void main(String[] args)
     {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        String output = isPrime(number);
        System.out.println(output);
    }    
}
