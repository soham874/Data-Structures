package LinkedLists;

import java.util.Scanner;

import LinkedLists.UtilitiesCLL.cNode;

public class RockPaperScissor {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		UtilitiesCLL.insertNode(1, "Rock");
		UtilitiesCLL.insertNode(2, "Paper");
		UtilitiesCLL.insertNode(3, "Scissor");

		System.out.println("<1> Rock <2> Paper <3> Scissor");
		int choice = sc.nextInt();

		cNode n = UtilitiesCLL.cNode.head;

		while (n.data != choice)
			n = n.next;

		System.out.println("Player chose " + n.stringdata);

		int compChoice = (int) (Math.floor(Math.random() * 10 % 3) + 1);

		if (n.next.data == compChoice)
			System.out.println("Computer chose " + n.next.stringdata + ". You lost!");

		else if (n.previous.data == compChoice)
			System.out.println("Computer chose " + n.previous.stringdata + ". You won!");

		else
			System.out.println("Computer also chose " + n.stringdata + ". Its a draw!");
	}

}
