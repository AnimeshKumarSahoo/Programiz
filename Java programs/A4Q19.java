public class A4Q19 {
    static void print2largest(int arr[], int n)
{
int i,j;
  for (i =0; i <n; i++)
  {
    if (i==n/2){
      System.out.println("The element found in ihe index"+ n/2+"is:"+ arr[i]);
      break;
    }
}
}
 
public static void main(String[] args)
{
  int arr[] = {12, 35, 5, 10, 34, 1};
  int n = arr.length;
  print2largest(arr, n);
}
}

    

