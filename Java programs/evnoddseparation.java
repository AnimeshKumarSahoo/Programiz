
public class evnoddseparation {
    public static void separate(int arr[],int size){
        int left=0;
        int right=size-1;
        for(int i=0;i<size;i++){
            while(arr[left]%2==0){
                left++;
            }
            while(arr[right]%2==1){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            }
        }
     public static void main(String args[]) {
int arr[]={1,2,5,3,8};
int size=arr.length;
System.out.println("Original array elements are:");
for(int i=0;i<size;i++)
 {
System.out.println(arr[i]+" ");
 } 
 separate(arr, size);
 System.out.println("After seaparation the array becomes:");
 for(int i=0;i<size;i++)
 {
System.out.println(arr[i]+" ");
 } 


    }
}
