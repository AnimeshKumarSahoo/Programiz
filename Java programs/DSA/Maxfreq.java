package DSA;
import java.util.Scanner;
public class Maxfreq {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.next();
char maxcount=str.charAt(0);
int c=0;
int max=0;
for(int i=0;i<str.length();i++){
    for(int j=i+1;j<str.length()-1;j++){
        if(str.charAt(i)==str.charAt(j)){
            c++;
        }
    }
    if(c>max){
        max=c;
        maxcount=str.charAt(i);
    }
}
System.out.println("The maximum occurance of a character in a string is:"+maxcount);

    }
}
