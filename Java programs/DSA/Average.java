package DSA;
import java.util.Scanner;
public class Average {
   public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the elements of the array"); 
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Average of all the elements of an array is: " + sum/arr.length);  
    }  
}   

