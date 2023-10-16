import java.util.Scanner;
class countfrequency{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       int a[]=new int[6];

       System.out.print("Enter a number: ");

       int n,i;

       n=sc.nextInt();

       while(n!=0){

           a[n%10]++;

           n/=10;

       }

       for(i=0;i<a.length;i++){

           if(a[i]!=0)

               System.out.println("Frequency of "+i+" is: "+a[i]);
       }
    }
}


