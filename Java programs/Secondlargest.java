import java.util.Arrays;
public class Secondlargest {
    static void print2largest(int arr[], int n)
{
int i,j;
  if (n < 2)
  {
    System.out.println(" Invalid Input ");
    return;
  }
  Arrays.sort(arr);
  for (i = n - 2; i >= 0; i--)
  {
    if (arr[i] != arr[n - 1]){
    
      System.out.println("The second largest element is:"+ arr[i]);
      break;
    }

      System.out.println("There is no second largest element");
}
}


 
public static void main(String[] args)
{
  int arr[] = {12, 35, 1, 10, 34, 1};
  int n = arr.length;
  print2largest(arr, n);
}
}

