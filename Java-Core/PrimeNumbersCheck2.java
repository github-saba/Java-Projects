/* This class demonstrates to check an integer is prime or not. This is an improved and efficient version  */

// Import statement
import java.util.ArrayList;

public class PrimeNumbersCheck2 { 
  // Method for checking an integer is prime or not.
  public boolean isPrime(int number) {
     if (number < 2) {
        return false;
     } else if (number == 2) {
        return true;
     } else { 
          /* More Efficient - Instead of checking every number from 2 to number - 1,
          you only need to check up to the square root of the number */
          for (int i = 2; i <= Math.sqrt(number); i++) {
              if (number % i == 0) {
                  return false;
              }
          }
          return true;
      }
  } 

  // Method for returning only prime numbers from given integer array.
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    
      ArrayList<Integer> primes = new ArrayList<Integer>();
    
      // Storing only Prime numbers into the primes arraylist.
      for(int number : numbers) {
          if (isPrime(number)) {
            primes.add(number);
          }
      }  
      return primes;
  }

  public static void main(String[] args) { 
    PrimeNumbersCheck2 pd = new PrimeNumbersCheck2();
    int[] numbers = new int[101];
    
    // Storing 0 to 100 numbers into numbers array.
    for(int i = 0; i <= 100; i++){
        numbers[i] = i;
    }
    System.out.println("Prime numbers between zero to hundred: ");
    System.out.println(pd.onlyPrimes(numbers));
  } 
}
