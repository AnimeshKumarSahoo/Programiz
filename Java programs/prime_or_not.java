package CSW.CSW2;

public class prime_or_not {

    static boolean prime(int n){
        for(int i = 2; i<(n/2); i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        if(prime(53))
            System.out.println("Prime");
        else
            System.out.println("Not a prime number");
    }
}
