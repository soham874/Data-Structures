package LinkedLists;

import java.util.Scanner;

public class Utility {

	public static Scanner sc = new Scanner(System.in);

	public static int getInteger(String s) {
		System.out.println(s);
		return Integer.parseInt(sc.next());
	}
}
