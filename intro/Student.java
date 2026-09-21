
public class Student {
	
	String name;
	int grade;
	String[] friends;
	
	public Student(String name, int g, String[] friends) {
		
		this.name = name;
		grade = g;
		this.friends = friends;
	}
	
	public void endYear() {
		grade += 1;
	}
	
	public boolean isPopular() {
		if (friends.length > 1) 
			return true;
		return false;
	}
	

	public static void main(String[] args) {

		Student tommy = new Student("tommy", 12);
		Student allen = new Student("allen", 11);
		
		System.out.println(tommy.grade);
		System.out.println(allen.grade);
	}

}
