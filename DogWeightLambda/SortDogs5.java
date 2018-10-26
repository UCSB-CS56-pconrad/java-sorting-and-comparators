import java.util.ArrayList;
import java.util.Comparator;
public class SortDogs5 {

    public static void main(String [] args) {
	ArrayList<Dog> kennel = new ArrayList<Dog>();
	
	kennel.add(new Dog("Fido",15));
	kennel.add(new Dog("Spot",20));
	kennel.add(new Dog("Puddles",8));
	kennel.add(new Dog("Doge",45));
	kennel.add(new Dog("Catepillar",90));
	
	System.out.println("Not sorted: " + kennel);
	java.util.Collections.sort(kennel);
	System.out.println("Sorted by name " + kennel);

	Comparator<Dog> sortByWeight = (o1,o2) ->  Double.compare(o1.getWeight(),o2.getWeight());
	kennel.sort(sortByWeight);
	System.out.println("Sorted by weight " + kennel);	
    }   
}
