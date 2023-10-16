public class Oddcount1 {
    public static void oddcount(int arr[],int size) {
        int i,j=0;
        System.out.println("Odd occurances of the elements are:");
        for(i=0;i<size;i++) {
            int c=0;
            for( j=0;j<size;j++) {
                if(arr[i]==arr[j]) {
                    c++;
                }
            }
        
            if(c%2==1) {
                System.out.print(arr[i]+" ");
            }
        }
    }
    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
    int arr[]= {1,1,1,2,2,3,4,4};
    int size=arr.length;
    oddcount(arr,size);
    
        }
    
    }

