package Stack;

public class TowerOfHanoi {
	public static void main(String[] args) {
		UtilityS stack = new UtilityS();

		int[] first = new int[UtilityS.max];
		int[] second = new int[UtilityS.max];
		UtilityS.selectStaack(first);

		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.printstack();

		UtilityS.selectStaack(second);

		stack.push(40);
		stack.push(20);
		stack.push(30);

		stack.printstack();

		UtilityS.selectStaack(first);

		stack.printstack();
		
		UtilityS.selectStaack(second);

		stack.printstack();
		
		UtilityS.selectStaack(first);

		stack.printstack();
		
		UtilityS.selectStaack(second);

		stack.printstack();

	}
}
