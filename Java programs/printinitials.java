import java.util.Scanner;
public class printinitials {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the person");
String name=sc.nextLine();
if(name.length()==0)
return;
System.out.print(Character.toUpperCase(name.charAt(0)));
for(int i=1;i<name.length()-1;i++){
    if(name.charAt(i)== ' ')
System.out.print(" "+ Character.toUpperCase(name.charAt(i+1)));
}
    }
}