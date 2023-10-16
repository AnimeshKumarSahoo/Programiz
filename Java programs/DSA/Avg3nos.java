package DSA;

import java.util.Scanner;

public class Avg3nos {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        System.out.print("The average of 3 numbers is:" + avg(num1, num2, num3) );
    }

  public static double avg(int a, int b, int c)
    {
        return (a + b + c) / 3;
    }
}

