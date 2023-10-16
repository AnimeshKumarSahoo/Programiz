import java.util.Scanner;
public class countbits {
    public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer number");
int n=sc.nextInt();
int c=0;
while(n!=0){
    c++;
    n>>=1;
}
System.out.println("Total no of bits in an integer no is:"+c);
    }
}
