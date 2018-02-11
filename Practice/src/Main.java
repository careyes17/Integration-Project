
//Carlos Reyes
//Inquisitive Quiz
//Welcome to my integration project!

import java.util.Scanner;

public class Main {
	//Creating a Scanner object to take user inputs
	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the most thrilling quiz game of the century!\nWhat is your name, challenger?");
		//Creating a string variable called "name" to get a user's name
		String name = new String(scan.nextLine());
		//Creating a boolean in order to return if a string has an int using this for loop
		boolean intInString = false;
		for (char c : name.toCharArray()) {
			if (Character.isDigit(c)) {
				intInString = true;
			}
		}
		//Testing if nothing is typed in for name
		if (name.length() == 0) {
			System.out.println("Hah! You cannot fool me.\nPlease enter your name.");
			name = scan.nextLine();
			System.out.println("Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
		//Testing if the name is only 1 letter
		} else if (name.length() == 1) {
			System.out.println("You have a one letter name?\nYeah, think again. Please enter your name.");
			String previousNameEntry = name;
			name = scan.nextLine();
			if (name.equals(previousNameEntry)) {
				System.out.println("Oh, I see. Sorry for being snarky...\nNevertheless, let us begin the game, " + name + ".");
			}
		}
		//Testing if the name contains an int
		else if (intInString) {
			System.out.println("We don't have all day here.\nPlease enter your name.");
			name = scan.nextLine();
			System.out.println("Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
		}
		//If the user enters their real name, the intended response executes
		else {
			System.out.println("Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
		}
		
		

	}

}