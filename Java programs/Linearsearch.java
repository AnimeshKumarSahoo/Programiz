import java.util.Scanner;
public class Linearsearch{
    public static int search(int arr[],int key){
for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
        return i; 
    } 
}
 return -1;  
}

 public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array length");
int l=sc.nextInt();
int ar[]=new int[l];
System.out.println("Enter the elements of the array");
for(int i=0;i<l;i++){
    ar[i]=sc.nextInt();
}
System.out.println("Enter the key");
int key=sc.nextInt();
int value=search(ar,key) ;  
if(value==-1){
System.out.println("Element not found");
}
else{
System.out.println(key+"is found in"+search(ar, key)+"th position" );
    }
}
}