
//Carlos Reyes
//Inquisitive Quiz
//Welcome to my integration project!

/*
-----Variables-----
Variables are containers that hold values that are used in a program.
In Java, every variable must be declared to use a data type.
A variable could be declared to use one of the eight primitive data types: byte, short, int, long, float, double, char or boolean.
-----Data Types-----
There are 8 primitive, built-in data types
btye- The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
short- The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
int- The int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1.
long- The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1.
float- The float data type is a single-precision 32-bit IEEE 754 floating point. This should not be used for precise calculations.
double- The double data type is a double-precision 64-bit IEEE 754 floating point. This should be used for decimal numbers.
char- The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
boolean- The boolean data type has only two possible values: true and false. 
*/

import java.util.Scanner;

public class Main {
  // Creating a Scanner object to take user inputs
  public static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println(
        "Welcome to the most thrilling quiz game of the century!\nWhat is your name, challenger?");
    // Creating a string variable called "name" to get a user's name
    String name = new String(scan.nextLine());
    // Creating a user object for the player
    User user = new User(45, "Hard");
    User user2 = new User(12);
    User user3 = new User("Easy");
    // Setting some placeholder information in the user object's variables
    user.setAge(18);
    user.setDifficultySelection("Medium");
    user2.setAge(25);
    user2.setDifficultySelection("Easy");
    user3.setAge(58);
    user3.setDifficultySelection("Hard");
    // Creating a boolean in order to return if a string has an int using this
    // for
    // loop
    boolean intInString = false;
    for (char c : name.toCharArray()) {
      if (Character.isDigit(c)) {
        intInString = true;
      }
    }
    // Testing if nothing is typed in for name
    if (name.length() == 0) {
      System.out.println("Hah! You cannot fool me.\nPlease enter your name.");
      name = scan.nextLine();
      System.out.println(
          "Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
      // Testing if the name is only 1 letter
    } else if (name.length() == 1) {
      System.out.println(
          "You have a one letter name?\nYeah, think again. Please enter your name.");
      String previousNameEntry = name;
      name = scan.nextLine();
      if (name.equalsIgnoreCase(previousNameEntry)) {
        System.out.println(
            "Oh, I see. Sorry for being snarky...\nNevertheless, let us begin the game, "
                + name + ".");
      }
    }
    // Testing if the name contains an int
    else if (intInString) {
      System.out
          .println("We don't have all day here.\nPlease enter your name.");
      name = scan.nextLine();
      System.out.println(
          "Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
    }
    // If the user enters their real name, the intended response executes
    else {
      System.out.println(
          "Oh, it's you, " + name + "?\nThis will be fun. Let us begin.");
    }
    int score = 0;
    System.out.println("You currently have a score of " + score
        + ".\nYour score is " + isEvenOrOdd(score));
    // v Method Call v Method Argument
    System.out.println(printScore(score));
    System.out.println("There are " + User.getNumberOfUsers() + " Users.");
  }

  // A method that checks if a score is even or odd
  // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv header
  public static String isEvenOrOdd(int score) {
    // ^ header parameter
    // If an int score divided by an int 2 is equal to an int score divided by a
    // casted double 2, then the number is even.
    // If an int unevenly divides with another int, the value will lose
    // precision,
    // but if the calculation includes a double, it will be accurate
    if (score % 2 == 0) {
      return "even!";
    }
    // If the int division lost precision, then "odd!" is returned
    else {
      return "odd!";
    }

  }

  public static String printScore(int score) {
    String scoreReport = new String();
    switch (score) {
      case 0:
        scoreReport = "So your score is 0? Laughable.";
        break;
      case 1:
        scoreReport = "You got something right... Impressive, for you, at least.";
        break;
      default:
        scoreReport = "Keep it up!";
        break;
    }
    // THESE SCORE ADDITIONS ARE PROOF OF CONCEPT EXAMPLES
    if (score * 2 == 4) {
      // score == 2
      scoreReport += "\nYour score is: " + score;
    } else if (score / 2 == 4) {
      // score == 8
      scoreReport += "\nYour score is: " + score;
    } else if (score - 2 == 7) {
      // score == 9
      scoreReport += "\nYour score is: " + score;
    } else if (score + 2 == 12) {
      // score == 10
      scoreReport += "\nYour score is: " + score;
    }
    // THESE STRING MODIFYING METHODS ARE SIMPLY USED AS PROOF OF CONCEPT
    // EXAMPLES
    scoreReport += "\nThe index of the first \"y\" in this message is: "
        + scoreReport.indexOf("y");
    scoreReport += "\nThe first 7 characters, including spaces, of this message are: "
        + scoreReport.substring(0, 7);
    scoreReport += "\nThis message in it's entirety in all lowercase letters: "
        + scoreReport.toLowerCase();
    // WHILE LOOP PROOF OF CONCEPT
    int counter = 0;
    while (counter != 6) {
      System.out.println("Counter is on count: " + counter++);
    }
    int[] intarray = new int[] { 1, 2, 3, 4, 8 };
    int smallestNumInArray;
    smallestNumInArray = findSmallestNumberInArray(intarray);
    System.out
        .println("The smallest number in the array is: " + smallestNumInArray);
    System.out
        .println("The sum of all values in the array is: " + getSum(intarray));
    System.out
        .println("The index of the number 4 in the \"intarray\" array is: "
            + findIndexOfValue(intarray, 4));
    // USING STRINGBUILDER TO MANIPULATE A STRING USING IT'S METHODS
    String strng = new String();
    strng = "Wow, this sure is a string!";
    StringBuilder strngBuilder = new StringBuilder();
    strngBuilder.append(strng);
    System.out.println("String before being modified :" + strngBuilder);
    strngBuilder.delete(0, 6);
    strngBuilder.insert(0, "T");
    strngBuilder.append(" Wow!");
    System.out.println("String after being modified :" + strngBuilder);
    return scoreReport;
  }

  // SUM OF ALL VALUES IN AN ARRAY PROOF OF CONCEPT
  public static int getSum(int[] intarray) {
    int accumulator = 0;
    for (int i = 0; i < intarray.length; i++) {
      accumulator += intarray[i];
    }
    return accumulator;
  }

  // LOWEST VALUE IN AN ARRAY PROOF OF CONCEPT
  // USE OF A FOR EACH LOOP
  // Static means that the member variable, or method, can be accessed without
  // an instantiation of the class where it belongs.
  // A static field allows a variable to be used among all of the instances of
  // the class, holding the same value for every object.
  public static int findSmallestNumberInArray(int[] intarray) {
    int smallest = 0;
    for (int i : intarray) {
      if (i == intarray[0]) {
        smallest = i;
      }
      if (i < smallest) {
        smallest = i;
      }
    }
    return smallest;
  }

  // INDEX OF VALUE IN AN ARRAY PROOF OF CONCEPT
  public static int findIndexOfValue(int[] intarray, int a) {
    int currentIndex = 0;
    int i = 0;
    while (intarray[i] != a) {
      currentIndex = i;
      i++;
    }
    return currentIndex + 1;
  }

}