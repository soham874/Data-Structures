package Graph;

import java.util.ArrayList;

public class UtilityG {

	private static ArrayList<GNode> graph = new ArrayList<GNode>();

	private static int vertices;
	private static int[][] matrix;

	// each node of a graph
	public static class GNode {
		GNode next;
		int data;

		GNode(int d) {
			data = d;
			next = null;
		}
	}

	// prints the adjacency matrix
	public static void printMatrix() {
		System.out.println("~~~~~~~~~~~ADJACENCY MATRIX~~~~~~~~~~~~~");
		System.out.print("  ");
		for (int i = 0; i < vertices; i++)
			System.out.print(" " + i);
		System.out.println();
		System.out.println("----------------");

		for (int i = 0; i < vertices; i++) {

			System.out.print(i + "| ");

			for (int j = 0; j < vertices; j++)
				System.out.print(matrix[i][j] + " ");

			System.out.println();
		}

	}

	// push an edge to the graph
	public static void pushEdge(int v1, int v2) {
		System.out.println("Pushing edge between " + v1 + " and " + v2 + ".....");
		if (v1 == v2) {
			System.out.println("Error..attempt to create edge between same vertices");
			return;
		}

		checkExistance(v1);
		checkExistance(v2);

		addEdge(v1, v2);

		System.out.println("Edge successfully added to graph");
	}

	// adds v2 to list for v1
	private static void addEdge(int v1, int v2) {

		GNode vertex2 = new GNode(v2);

		for (int i = 0; i < graph.size(); i++) {

			if (graph.get(i).data == v1) {

				GNode current = graph.get(i);

				while (current.next != null)
					current = current.next;

				current.next = vertex2;
			}
		}

	}

	// checks if the data exists in graph
	private static void checkExistance(int v) {

		for (int i = 0; i < graph.size(); i++) {
			if (graph.get(i).data == v)
				return;
		}

		GNode current = new GNode(v);
		graph.add(current);
	}

	// prints the adjacency list
	public static void printList() {
		System.out.println("~~~~~~~~~~~ADJACENCY LIST~~~~~~~~~~~~~");
		for (int i = 0; i < graph.size(); i++) {
			GNode current = graph.get(i);
			while (current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println();
		}
	}

	// populates the adjacency matrix from list
	public static int[][] populateMatrix() {
		vertices = graph.size();
		matrix = new int[vertices][vertices];

		for (int i = 0; i < vertices; i++) {
			
			GNode current = graph.get(i);
			int head = current.data;

			while (current != null) {
				matrix[head][current.data] = (head == current.data)?0:1;
				current = current.next;
			}

		}

		return matrix;
	}
}