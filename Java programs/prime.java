import java.util.Scanner;
public class prime {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[7];
       boolean isprime=true;
       System.out.println("Enter the array elements");
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
for(int j=2;j<i;j++)
{
if(i%j==0){
    
    isprime=false;
    break;
}

}
       
if(isprime)
    System.out.println("The prime numbers are"+arr[i]);
    
}
}
}