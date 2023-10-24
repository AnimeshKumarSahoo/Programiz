import java.util.Scanner;

public class Product_bitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two nos : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int res = 0;

		while (b > 0) {
			if ((b & 1) != 0)
				res = res + a;
			a = a << 1;
			b = b >> 1;
		}
		System.out.println("Product using and : " + res);
		
		
		sc.close();
	}

}
