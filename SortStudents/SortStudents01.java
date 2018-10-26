import java.util.ArrayList;
import java.util.Comparator;

public class SortStudents01 {
    
    public static void main(String [] args) {
	
	ArrayList<Student> roster = Student.makeRoster();
	
	System.out.println("Orig: \n"+ roster);
	
	// this works if/only if roster "is-a" List<T>, and
	// T implements Comparable.
	
	java.util.Collections.sort(roster);
	
	System.out.println("Sorted using Student compareTo: \n" + roster);

	// the second argument is an instance of an anonymous inner class
	// that implements java.util.Comparator<Student>
	
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
	System.out.println("Sort by lastName: \n" + roster);

	// the second argument is an instance of an anonymous inner class
	// that implements java.util.Comparator<Student>, specified as
	// a Lambda Expression
	
	java.util.Collections.sort(roster,
				   (s1,s2)->(Double.compare(s1.getGpa(),
							    s2.getGpa())));
	System.out.println("Sorted using gpa: \n" + roster);
    }
    
}
