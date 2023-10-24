public class reverse_of_number {

    static int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10+(n%10);
            n/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(5469216));
    }
}
