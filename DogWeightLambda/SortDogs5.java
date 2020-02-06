import java.util.ArrayList;
import java.util.Comparator;

public class SortDogs5 {

	public static void main(String[] args) {
		ArrayList<Dog> kennel = new ArrayList<Dog>();

		kennel.add(new Dog("Fido", 15));
		kennel.add(new Dog("Spot", 20));
		kennel.add(new Dog("Puddles", 8));
		kennel.add(new Dog("Doge", 45));
		kennel.add(new Dog("Catepillar", 90));

		System.out.println("Not sorted: " + kennel);

		java.util.Collections.sort(kennel);
		System.out.println("Sorted by name " + kennel);

		Comparator<Dog> sortByWeight = (o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight());

		kennel.sort(sortByWeight);
		System.out.println("Sorted by weight using kennel.sort " + kennel);

		java.util.Collections.sort(kennel);
		System.out.println("Sorted by name " + kennel);

		java.util.Collections.sort(kennel, sortByWeight);
		System.out.println("Sorted by weight using java.util.Collections.sort: " + kennel);

		kennel.sort( (d1,d2) ->   d1.getName().length() - d2.getName().length()  );

		System.out.println("Sorted by length of name: " + kennel);


		Comparator<Dog> byNameLength = (d1,d2) ->   d1.getName().length() - d2.getName().length();
		Comparator<Dog> byName = (d1,d2) ->   d1.getName().compareTo(d2.getName());

		kennel.sort( byNameLength.thenComparing(byName) );

		System.out.println("Sorted by length of name then lex by name" + kennel);

	}


}
