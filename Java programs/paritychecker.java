import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class paritychecker {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer number");
int n=sc.nextInt();
int c=0;
while(n!=0){
    if(n%2==1)
        c++;
    n>>=1;
}
System.out.println("The no of one's in the number is:"+c);
if(c%2==0){
    System.out.println("The binary word is 0");
}
else
System.out.println("The binary word is 1");
}
    }


