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
		gpa + "]\n");
    }

    public static ArrayList<Student> makeRoster() {
	ArrayList<Student> roster = new ArrayList<Student>();
	
	roster.add(new Student("Jim","Gaucho",1234568,3.68));
	roster.add(new Student("Suzy","Gaucho",1234569,3.88));
	roster.add(new Student("Pat","Isla",2345678,2.56));
	roster.add(new Student("Chris","Vista",1234567,3.78));
	roster.add(new Student("Maria","Goleta",9876543,3.99));
	roster.add(new Student("Kevin","Chen",44444444,2.01));
	return roster;
    }

    public static void main(String [] args) {
	ArrayList<Student> roster = Student.makeRoster();
	System.out.println("roster=" + roster);
    }

}
