/* Author: David Omondiagbe 
This program gets input from user and shows how many iterations are needed to find out if the number is prime or not. If the number is composite,  factors of the given number are displayed  github url: https://github.com/sirbecks177/PrimeNumber */

import java.util.Scanner;
public class PrimeNumber 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Please give a number> ");
int n = sc.nextInt();
boolean isPrime1 = checkPrimeMethod1(n);
boolean isPrime2 = checkPrimeMethod2(n);
}
  
private static boolean checkPrimeMethod1(int n)
{
boolean isPrime1 = true;
int count =0;
  
if (n <= 1) 
 {
  isPrime1=false;
  return isPrime1;
 }

for (int i = 2; i < n; i++) 
 {
  if (n % i == 0) 
   {
    isPrime1=false;
   }

  count ++;
 }

int total =count;

if (isPrime1) 
  {
    System.out.println(n + " is prime number");

  }
 else 
  {

    System.out.print(n + " is composite number and factors are ->  " );
    factors(n);
    System.out.print("\n");

  }

System.out.println("With 1st method number of iteration  is: " + total);
return isPrime1;
}


private static boolean checkPrimeMethod2(int n) 
{

boolean isPrime2 = true;
int count =0;
if (n <= 1) 
  {

    isPrime2=false;
    return isPrime2;
  }

for (int i = 2; i <= Math.sqrt(n); i++) 
 {

  if (n % i == 0) 
  {
    isPrime2=false;

  }

  count ++;
 }


int total =count;
System.out.println("With 2nd method number of iteration  is: " + total);
return isPrime2;

}

  private static void factors(int a) 
{
    for(int j=1; j <= a; j++) 
    {
        if(a % j == 0)
           System.out.print(j+ " ");
    }
 }

 
}
