import java.util.ArrayList;

public class NaiveAttempt2 {

	public static void main(String [] args) {

		ArrayList<Dog> things = new ArrayList<Dog>();

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
