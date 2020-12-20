package Stack;

public class CelebrityProbblem {

	public static int[][] matrix = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
	
	public static UtilityS utility = new UtilityS();

	public static void main(String[] args) {

		check(0);

	}

	private static void check(int current) {
		
		if(UtilityS.exists(current)) {
			System.out.println("No celebrity in this group");
			System.exit(0);
		}
		
		for (int i = 0; i <= 3; i++)
			if (matrix[current][i] == 1) {
				utility.push(i);
				check(i);
			}
				
		
		System.out.println("Celebrity ID is " + current);
		System.exit(0);

	}

	

}
