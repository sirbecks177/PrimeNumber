/* David Omondidagbe */

import java.util.Scanner;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Please give a number> ");
int n = s.nextInt();
if (isPrime(n)) {
System.out.println(n + " is prime number and factors are");
} else {
System.out.println(n + " is composite number and factors are");
}
}
public static boolean isPrime(int n) {
if (n <= 1) {
return false;
}
for (int i = 2; i < Math.sqrt(n); i++) {
if (n % i == 0) {

return false;

}
}
return true;
}
}
