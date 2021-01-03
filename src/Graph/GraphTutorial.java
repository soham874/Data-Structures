package Graph;


public class GraphTutorial {
	public static void main(String[] args) {
		
		UtilityG.pushEdge(0,1);
		UtilityG.pushEdge(0,4);
	
		UtilityG.pushEdge(1,0);
		UtilityG.pushEdge(1,4);
		UtilityG.pushEdge(1,2);
		UtilityG.pushEdge(1,3);
		
		UtilityG.pushEdge(2,1);
		UtilityG.pushEdge(2,3);
		
		UtilityG.pushEdge(3,1);
		UtilityG.pushEdge(3,4);
		UtilityG.pushEdge(3,2);
		
		UtilityG.pushEdge(4,3);
		UtilityG.pushEdge(4,0);
		UtilityG.pushEdge(4,1);
		
		UtilityG.printList();
		
		UtilityG.populateMatrix();
		
		UtilityG.printMatrix();
	}
}
