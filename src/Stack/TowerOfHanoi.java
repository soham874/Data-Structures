package Stack;

public class TowerOfHanoi {
	public static void main(String[] args) {
		UtilityS stack = new UtilityS();

		int[] source = new int[UtilityS.max];
		int[] auxillary = new int[UtilityS.max];
		int[] destination = new int[UtilityS.max];

		int n = 5;
		
		stack.selectStaack(source);
		for (int i = n; i >= 1; i--)
			stack.push(i);
		
		
		System.out.println("Before move");
		stack.selectStaack(source);stack.printstack();
		stack.selectStaack(destination);stack.printstack();

		for (int i = 1; i <= (Math.pow(2, n)- 1); i++)
			if (i % 3 == 0) {
				stack.selectStaack(auxillary);
				int temp = stack.peek();
				stack.pop();
				stack.selectStaack(destination);
				stack.push(temp);
			} else if (i % 3 == 1) {
				stack.selectStaack(source);
				int temp = stack.peek();
				stack.pop();
				stack.selectStaack(destination);
				stack.push(temp);
			} else {
				stack.selectStaack(source);
				int temp = stack.peek();
				stack.pop();
				stack.selectStaack(auxillary);
				stack.push(temp);
			}
		System.out.println("After move");
		stack.selectStaack(source);stack.printstack();
		stack.selectStaack(destination);stack.printstack();

	}
}
