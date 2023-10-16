package DSA;
import java.util.Scanner;
public class Noofdigits {
   public static void main(String[] args)
   {
      int num; 
      int c=0;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      while(num!=0)
      {
         num = num/10;
         c++;
      }
      System.out.println("The Total Number of Digits = " +c);
   }
} 

