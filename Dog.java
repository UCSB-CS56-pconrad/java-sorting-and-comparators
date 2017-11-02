public class Dog implements Comparable<Dog>  {

	// exam (or interview question) is Dog mutable or immutable?
	
	private String name;
	private double weight;
	public String getName() { return name; }
	public double getWeight() { return weight; }
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString () {
		return "[" + name + "," + weight + "]";
	}
						  
	public int	compareTo(Dog otherDog) {
		// return negative number if this < otherDog, according to my "order"
		// return 0 if this == otherDog, according to my "order"
		// return positive if this > otherDog, according to my "order"
		
		// return this.name.compareTo(otherDog.name);

		if (this.name.compareTo(otherDog.name) < 0) {
			return -1;
		} else if (this.name.equals(otherDog.name)) {
			return 0; 
		} else {
			return 1;
		}
			
	}
	
}
