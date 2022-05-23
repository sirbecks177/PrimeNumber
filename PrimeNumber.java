/* David Omondidagbe */

import java.util.Scanner;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Please give a number> ");
int n = sc.nextInt();
boolean isPrime = checkPrime(n);
if (isPrime) {
System.out.println(n + " is prime number and factors are");
} else {
System.out.println(n + " is composite number and factors are");
}
}
public static boolean checkPrime(int n) {
  
  boolean isPrime = true;
if (n <= 1) {
isPrime=false;
return isPrime;
}
for (int i = 2; i < n/2; i++) {
if (n % i == 0) {

isPrime=false;
return isPrime;

}
}

return isPrime;
}
}
