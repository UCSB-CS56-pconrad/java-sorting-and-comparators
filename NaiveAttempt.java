import java.util.ArrayList;

public class NaiveAttempt {

	public static void main(String [] args) {

		ArrayList<String> things = new ArrayList<String>();

		things.add("Cup");
		things.add("Stapler");
		things.add("Pencil");
		things.add("Plate");
		things.add("Ball");

		System.out.println("Not sorted: " + things);

		java.util.Collections.sort(things);
		
		System.out.println("Sorted? " + things);





	}

}
