package Stack;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
   {
      int num, i, count=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      
      for(i=1; i<=num; i++)
      {
         if(num%i == 0)
         {
            count++;   
         }
      }
      if(count==2){
         System.out.println("\nIt is a Prime Number.");
      }
      else{
         System.out.println("\nIt is not a Prime Number.");
      }
   }
}
    

