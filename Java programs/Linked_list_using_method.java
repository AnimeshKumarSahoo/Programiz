import java.util.*;

public class Linked_list_using_method {

	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("A");
		obj.add("B");
		obj.addFirst("C");
		obj.addLast("D");
		obj.add(1, "E");
		obj.add("F");
		obj.add("G");
		
//		for(char c = 'A'; c<'H'; c++) {
//			obj.add(String.valueOf(c));
//		}
		
//		obj.addFirst("C");
//		obj.addLast("D");
//		
//		obj.add(1, "E");
		System.out.println(obj);
		
		obj.removeFirst();
		obj.removeLast();
		obj.remove(3);
		
		System.out.println("Contains E or not : " + obj.contains("E"));
		System.out.println("Size of Linked List : " + obj.size());
		
		System.out.println("Element in 2nd index : " + obj.get(2));
		
		obj.set(3, "Y");
		System.out.println(obj);
	}

}
