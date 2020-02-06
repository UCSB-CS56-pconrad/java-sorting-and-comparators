package dogs;

import java.util.ArrayList;

public class SortDogs3 {

	public static class DogWeightComparator implements java.util.Comparator<Dog> {
		@Override
		public int compare(Dog o1, Dog o2) {
			return Double.compare(o1.getWeight(), o2.getWeight());
		}
	}

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
		java.util.Comparator<Dog> sortByWeight = new DogWeightComparator();
		java.util.Collections.sort(kennel, sortByWeight);
		// OR
		java.util.Collections.sort(kennel, new DogWeightComparator() );


		System.out.println("Sorted by weight " + kennel);
	}
}
