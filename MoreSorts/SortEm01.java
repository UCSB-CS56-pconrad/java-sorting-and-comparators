import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
	
public class SortEm01 {


	public static void main(String [] args) {

		ArrayList<String> things = new ArrayList<String>();

		things.add("Cup");
		things.add("Stapler");
		things.add("Pencil");
		things.add("Plate");
		things.add("Ball");

		System.out.println("Not sorted: " + things);

		Collections.sort(things);

		System.out.println("Sorted (default sort) " + things);

	   
		Comparator<String> sortByLength = new Comparator<String> () {
				public int compare(String o1, String o2) {
					return (o1.length() - o2.length());
				}
			};
		
		Collections.sort(things,sortByLength);

		System.out.println("Sorted (by length) " + things);
	}



}
