package exercise2;
import java.util.Scanner;
public class EvenOrOddNumber {
  public static void main (String [] args) {
Scanner input = new Scanner (System.in);
System.out.println ("Enter a random number:  ");
int number = input.nextInt ();
if (number%2 == 0) {
  System.out.println ("The number is Even");
}
else {
  System.out.println ("The number is Odd");
}
  }
}
  