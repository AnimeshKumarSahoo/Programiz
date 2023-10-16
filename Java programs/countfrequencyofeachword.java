import java.util.Scanner;
public class countfrequencyofeachword {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
System.out.println("Enter the word you want to find");
String word=sc.next();
System.out.println(countoccurance(str,word));
    }
    public static int countoccurance( String str,String word){
        String arr[]=str.split(" ");
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(word.equals(arr[i]))
            c++;
        }
        return c;
    }
}
