import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String first;
	private String last;
	private int perm;
	private double gpa;

    public String getFirst() {return this.first ;}
	public String getLast(){return this.last ;}
	public int    getPerm(){return this.perm ;}
	public double getGpa(){return this.gpa ;}


	/** 
		"Natural order" of students is to sort by perm
	 */
	public int compareTo(Student other) {
		return this.perm - other.perm;
	}
	
	public Student(  String first,
					 String last,
					 int perm,
					 double gpa) {
		this.first = first;
		this.last = last;
		this.perm = perm;
		this.gpa = gpa;
	}

	public String toString() {
		return ("[" +
				first + "," +
				last + "," +
				perm + "," +
				gpa + "]");
	}
	
	public static void main(String [] args) {

		ArrayList<Student> roster = new ArrayList<Student>();

		roster.add(new Student("Jim","Gaucho",1234568,3.68));
		roster.add(new Student("Suzy","Gaucho",1234569,3.88));
		roster.add(new Student("Pat","del Playa",2345678,2.56));
		roster.add(new Student("Chris","Gaucho",1234567,3.78));
		roster.add(new Student("Maria","de la Playa",9876543,3.99));
		roster.add(new Student("Ole","Ole Ole Ole",44444444,2.01));

		System.out.println("Orig: " + roster);

		// this works if/only if roster "is-a" List<T>, and
		// T implements Comparable.
		
		java.util.Collections.sort(roster);

		System.out.println("Sorted using Student compareTo: " + roster);

		// the second argument is an instance of an anonymous inner class
		// the implements java.util.Comparator<Student>
		
		java.util.Collections.sort(roster,
								   (s1,s2)->(Double.compare(s1.getGpa(),
															s2.getGpa())));

		System.out.println("Sorted using gpa: " + roster);
		
		// the second argument is an instance of an anonymous inner class
		// the implements java.util.Comparator

		// byName compares by last name, then uses first to break ties.
		Comparator<Student> byLastName = new Comparator<Student> () {

				public int compare(Student s1, Student s2) {
					if (s1.getLast().equals(s2.getLast())) {
						return s1.getFirst().compareTo(s2.getFirst());
					} else {
						return s1.getLast().toUpperCase().compareTo(s2.getLast().toUpperCase());
					}

				}

			};
		
		roster.sort(byLastName); // ArrayList has a sort method 
		System.out.println("Sort by lastName: " + roster);

		
	}

	
}
