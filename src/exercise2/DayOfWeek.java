package exercise2;

import java.util.Scanner;

public class DayOfWeek {
  
  public static void main (String [] args) {

 Scanner input = new Scanner (System.in);
 System.out.println ("Enter a number between 1 and 7");
    
    int number = input.nextInt ();
    
    if (number == 1) {
      System.out.println ("Monday");
    }
    else if (number == 2) {
      System.out.println ("Tuesday");
    }
    else if (number == 3) {
      System.out.println ("Wedenesday");
    }
      else if (number == 4) {
        System.out.println ("Thursday");
      }
      else if (number == 5) {
        System.out.println ("Friday");
      }
      else if (number == 6) {
        System.out.println ("Saturday");
      }
      else {
        System.out.println ("Sunday");
      }
    }
    } 