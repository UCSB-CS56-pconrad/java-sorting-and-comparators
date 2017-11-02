import java.util.List;

public class NaiveAttempt0 {

	public static void main(String [] args) {

		List<String> things = new List<String>();

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
