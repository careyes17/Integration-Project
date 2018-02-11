
//Carlos Reyes
//Inquisitive Quiz
//Welcome to my integration project!

import java.util.Scanner;

public class Main {
	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the most thrilling quiz game of the century!\nWhat is your name, challenger?");
		String name = new String(scan.nextLine());
		boolean intInString = false;
		for (char c : name.toCharArray()) {
			if (Character.isDigit(c)) {
				intInString = true;
			}
		}
		if (name.length() == 0) {
			System.out.println("Hah! You cannot fool me.\nPlease enter your name.");
			name = scan.nextLine();
			System.out.println("Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
		} else if (name.length() == 1) {
			System.out.println("You have a one letter name?\nYeah, think again. Please enter your name.");
			String previousNameEntry = name;
			name = scan.nextLine();
			if (name.equals(previousNameEntry)) {
				System.out.println("Oh, I see. Sorry for being snarky...\nNevertheless, let us begin the game, " + name + ".");
			}
		}
		else if (intInString) {
			System.out.println("We don't have all day here.\nPlease enter your name.");
			name = scan.nextLine();
			System.out.println("Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
		}
		else {
			System.out.println("Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
		}
		
		

	}

}