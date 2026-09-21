import java.util.ArrayList;

public class Classroom {
	
	String subject, teacher;
	ArrayList<Student> students;
	
	public Classroom(String sub, String t) {
		subject = sub;
		teacher = t;
		students = new ArrayList<Student>();
	}
	
	public void averageGrade() {
		
		double sum = 0;
		
		for (Student s : students) {
			sum += s.grade;
		}
		System.out.println(sum/students.size());
	}
	
	public void addNewStudent(String name, int grade, String[] friends) {
		
		Student s = new Student(name, grade, friends);
		students.add(s);
	}
	
	public void popularCount() {
		int total = 0;
		for (Student s : students) {
			if (s.isPopular()) {
				total += 1;
			}
		}
		System.out.println(total);
	}
	
	

	public static void main(String[] args) {
		String[] tommyfriends = {"jackson"};
		String[] allenFriends = {"ed", "jay"};
		String[] lukeFriends = {"hamed", "james"};
		
		Classroom cs = new Classroom("CS", "Friedman");
		cs.addNewStudent("tommy", 12, tommyfriends);
		cs.addNewStudent("luke", 11, lukeFriends);
		cs.addNewStudent("allen", 10, allenFriends);
		
		cs.averageGrade();
		cs.popularCount();


	}

}
