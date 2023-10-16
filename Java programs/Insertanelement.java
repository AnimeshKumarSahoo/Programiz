
import java.util.Scanner;
public class Insertanelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of the array");
int l=sc.nextInt();
int a[]=new int[l];
System.out.println("Enter the elements of the array");
for(int i=0;i<l;i++) {
	a[i]=sc.nextInt();
}
System.out.println("enter the element you want to insert");
int ele=sc.nextInt();
System.out.println("enter the position you want to enter");
int pos=sc.nextInt();
int a2[]=new int[l+1];
for(int i=0;i<pos;i++) {
	a2[i]=a[i];
	a2[pos]=ele;
}
for(int j=pos+1;j<l+1;j++) {
	a2[j]=a[j-1];
}
for(int j=0;j<l+1;j++)
{
	System.out.println(a2[j]);
}
	}

}

