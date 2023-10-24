public class tower_of_hanoi {
	
	static void toh(int n, char src, char inter, char dest) {
		if(n==1) {
			System.out.println(src + " --> " + dest);
			return;
		}
		toh(n-1, src, dest, inter);
		toh(1, src, inter, dest);
		toh(n-1, inter, src, dest);
	}
	
	public static void main(String[] args) {
		toh(3, 'a', 'b', 'c');

	}

}
