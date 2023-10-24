import java.util.*;

public class Array_List {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		for(int i = 0; i<5; i++) {
			al.add(i);
		}
		al.add("Binay");
		
		System.out.println("Array is : " + al);
		System.out.println("Value of index 4 : " + al.get(4));
		al.remove(3);
		
		System.out.println("After removing index 3 : " + al);     
		
		System.out.println("Array empty : " + al.isEmpty());

	}

}