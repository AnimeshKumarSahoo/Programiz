package CSW.CSW2;
import java.util.*;

public class sum_double_arraylist {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(12.26381231);
		al.add(25.34749012);
		al.add(31.4471294);
		al.add(47.54712412);
		al.add(52.643274);
		System.out.println("The list is: " + al);
		
		double sum = 0;
		for(int i = 0; i<al.size(); i++) {
			sum+=al.get(i);
		}
		
		System.out.println("The sum is : " + sum); 
		
	}

}
