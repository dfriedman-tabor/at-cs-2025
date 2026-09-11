
public class arrays2d {
	
	
	public static void sum(int[][] nums) { 
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
			}
		}
		System.out.println(sum);
	}
	
	
	public static void combineFirsts(String[][] words) {
		
		
		for (int i = 0; i < words.length; i++) {
			String combo = "";
			
			for (int j = 0; j < words[i].length; j++) {
				
				combo += words[i][j].charAt(0);
			}
			System.out.println(combo);

			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[][]testNums = {{3,5,1}, {2, 0}, {3,5,8},{1}};
		String[][] words = {{"allen", "ed", "jay"}, {"luke", "hamed"},
				{"tommy", "james", "jackson"}};
		
		
		combineFirsts(words);
		
	}

}
