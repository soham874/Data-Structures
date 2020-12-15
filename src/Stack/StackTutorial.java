package Stack;

public class StackTutorial {
	public static void main(String[] args) {

		UtilityS utility = new UtilityS();
		
		//using push to populate stack
		utility.push(10); 		utility.push(20);		utility.push(30);
		
		//using isEmpty to check if stack successful
		if(utility.isEmpty())
			System.out.println("Empty stack");
		else
			System.out.println("Stack not empty");
		
		//using peek to check last pushed element 
		System.out.println("Last element is " + utility.peek());
		
		//using pop to remove last pushed element
		utility.pop();
				
		//checking if pop worked successfully
		System.out.println("Last element is " + utility.peek());
		
	}
}
