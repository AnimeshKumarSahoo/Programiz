package CSW.CSW2;

public class binary_equivalent {

    static int binary(int n) {
        int bin = 0, count = 0;
        while (n != 0) {
            int rem = n % 2;
            double c = Math.pow(10, count);
            bin += rem * c;
            n /= 2;
            count++;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(binary(25));
    }
}
