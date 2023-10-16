package Stack;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args)
   {
      int a, b, c, largest;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      a = scan.nextInt();
      System.out.print("Enter the Second Number: ");
      b = scan.nextInt();
      System.out.print("Enter the Third Number: ");
      c = scan.nextInt();
      
      if(a>b && a>c)
         largest = a;
      else if(b>a && b>c)
         largest = b;
      else
         largest = c;
      
      System.out.println("Largest no is = " +largest);
   }
}
    

