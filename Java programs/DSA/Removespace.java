package DSA;

import java.util.Scanner;

public class Removespace {
    public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine(); 
        str = str.replaceAll(" ", ""); 
        System.out.println("After Removing Whitespaces the entered string is:"+str); 
     }
    }
