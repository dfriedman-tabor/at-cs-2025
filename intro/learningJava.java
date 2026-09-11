import java.util.ArrayList;

public class learningJava {

	public static void sayHi() {
		
		System.out.println("hi"); 
		System.out.println("bye");
	}
	
	public static void checkThings(int age) {
		
		if (age > 65) {
			System.out.println("retire");
		}
		else if (age < 22) {
			System.out.println("learn");
			
		}
		else {
			System.out.println("work");
		}
	}
	
	public static void loopStuff() {
		
		
		int sum = 0;
		for (int i = 0; i < 10; i += 1) {
			
			
			sum += i;
		}
		System.out.println(sum);
	}
	
	
	public static void stringStuff(String word) {
		
		System.out.println(word.length());
	}
	
	public static void arrays(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]); 
		}
	}
	
	public static void lists(ArrayList<Integer> nums) {
		
		for (int i = 0; i < nums.size(); i+=1) {
			
			System.out.println(nums.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		int[] numArray = {5, 1, 8, 9};
		
		arrays(numArray);
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(4);
		numList.add(1);
		numList.add(2);
		numList.add(3);
		
		lists(numList);
	}
}






