/* This class demonstrates how to check an integer is Prime number or Not */

// Import statement
import java.util.ArrayList; 

public class PrimeNumbersCheck {
  
  //Method for checking an integer is prime or not.
  public boolean isPrime(int number) {
     if (number < 2) {
        return false;
     } else if (number == 2) {
        return true;
     } else { 
          for(int i=2; i<number; i++){
              if (number%i == 0) {
                   return false;
              }
          }
          return true;
    }
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
      ArrayList<Integer> primes = new ArrayList<Integer>();
      for(int i=0; i<numbers.length; i++) {
          if (isPrime(numbers[i])) {
            primes.add(numbers[i]);
          }
      }
      return primes;
  }

  public static void main(String[] args) {
    PrimeNumbersCheck pd = new PrimeNumbersCheck();
    int[] numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    System.out.println(pd.onlyPrimes(numbers));
  } 
}
