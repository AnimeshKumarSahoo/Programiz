import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;
public class search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
String str[]=new String[4];
System.out.println("Enter the string elements");
for(int i=0;i<str.length;i++){
    str[i]=sc.nextLine();
}
System.out.println("enter the string you want to search");
String str1=sc.next();
for(int i=0;i<str.length;i++){
    if(str[i].equals(str1))
System.out.println("The string:"+" "+str1+" "+"is present in"+i+" "+"position");}
System.out.println("Inavlid string");
    }
}
    


        
    

    


