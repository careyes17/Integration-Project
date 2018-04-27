
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

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.Predicate;
import java.time.format.*;
import java.time.*;

public class Main {
  // Creating a Scanner object to take user inputs
  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println(
        "Welcome to the most thrilling quiz game of the century!\nWhat is your name, challenger?");
    // Creating a string variable called "name" to get a user's name
    String name = new String();
    boolean nameContinue = false;
    while(nameContinue == false) {
    //Ensuring that no invalid inputs can be given for scan.nextLine()
    //If an invalid input is attempted, the user gets prompted to input
    //their name again.
    try {
    name = scan.nextLine();
    nameContinue = true;
    }
    catch(Exception e) {
      System.out.println("Nice try, buddy.\n What was your name again?");
    }
    }
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
    int[][] exampleArray = new int[3][3];
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        exampleArray[i][j] = j * i;
      }
    }
    //Find The Value 4 (coordinates) in exampleArray
    int xvalue = 100;
    int yvalue = 100;
    int breakVariable = 0;
    for(int i = 0; i < 3; i++) {
      if (breakVariable == 1) {
        break;
      }
      for(int j = 0; j < 3; j++) {
        if (exampleArray[i][j] == 4) {
          xvalue = i;
          yvalue = j;
          breakVariable = 1;
          break;
        }
      }
    }
    System.out.println("The location of the value 4 in the two-dimensional array \"exampleArray\" is: (" + xvalue + "," + yvalue + ").");
   
    //HIERARCHY DEMONSTRATION
    Animal penguin1 = new Penguin("Smaller than a typical desk", 45.5, "Gak, Gak.", 30);
    
    //INTERFACE DEMONSTRATION
    //This is an example of polymorphism, in which the interface Computer is declaring
    //a Computer type object, and this object is assigned to an implementation of that interface
    //MyComputer is overriding the methods of Computer in this example
    Computer myNewPC = new MyComputer("GeForce GTX 650 Ti BOOST", 3, 8);
    myNewPC.displaySpecs();
    myNewPC.changeGPU("Radeon RX 480");
    myNewPC.addFan(4);
    myNewPC.upgradeRam(16);
    myNewPC.displaySpecs();
   
    //QUEUE DEMONSTRATION
    Queue<Integer> queue1 = new LinkedList<Integer>();
    queue1.add(1);
    queue1.add(3);
    System.out.println(queue1);
    queue1.remove();
    System.out.println(queue1);
    
    //STACK DEMONSTRATION
    Stack<Integer> stack1 = new Stack<Integer>();
    stack1.push(101);
    stack1.push(102);
    stack1.push(103);
    System.out.println(stack1);
    stack1.pop();
    System.out.println(stack1);
    
    //HASHTABLE DEMONSTRATION
    Hashtable<Integer, String> hashtable1 = new Hashtable<Integer, String>();
    hashtable1.put(1, "This");
    hashtable1.put(2, "is");
    hashtable1.put(3, "a");
    hashtable1.put(4, "Demonstration");
    for (int i = 1; i <= 4; i++) {
      System.out.println(hashtable1.get(i));
    }
    
    //PREDICATE LAMBDA EXPRESSION EXAMPLE
    //Lambda expressions allow you send complex, often multi-line arguments
    //to a method in a short hand manner. In this example I am sending the
    //conditional statement "x < 5" to a while loop in sayHello.
    sayHello((x) -> x < 5);
    
    //TIME WHEN METHOD WAS CALLED
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println(now.format(format));
    
    //START OF TIC TAC TOE DEMONSTRATION
    String[][] toeArray = new String[3][3];
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        toeArray[i][j] = "-";
      }
    }
    System.out.println("Let's play 3T!");
    System.out.println("Enter which player you want to be. (1 or 2)");
    int player = 1;
    boolean playerCreated = false;
    Scanner scan1 = new Scanner(System.in);
    while (playerCreated == false) {
      try {
      scan1 = new Scanner(System.in);
      player = scan1.nextInt();
        if (player != 1 && player != 2) {
          throw new Exception();
        }
      playerCreated = true;
      }
    catch (Exception e) {
      System.out.println("Please input a valid player selection. (1 or 2)");
    }
    }
    boolean gameOn = true;
    int r;
    int t;
    toeDisplay(toeArray);
    while (gameOn) {
    try {
    System.out.println("Input x coordinate");
    scan = new Scanner(System.in);
    r = scan.nextInt();
    System.out.println("Input y coordinate");
    scan = new Scanner(System.in);
    t = scan.nextInt();
    gameOn = toeInput(r,t,toeArray,player);
    if (gameOn == false) {
      break;
    }
    scan = new Scanner(System.in);
    toeDisplay(toeArray);
    }
    catch (Exception e) {
      System.out.println("Invalid input. Please try again.");
    }
    }
    scan.close();
  }
  
  public static void sayHello(Predicate<Integer> condition) {
    int x = 0;
    while(condition.test(x)) {
      System.out.println("Hello!");
      x++;
    }
  }
  
  public static boolean toeInput(int a, int b, String[][] toeArray, int player) {
    try {
    if (toeArray[a][b].equals("X") || toeArray[a][b].equals("O")) {
      throw new Exception();
    }
    else {
      if (player == 1) {
        toeArray[a][b] = "X";
      }
      else {
        toeArray[a][b] = "O";
      }
      if (toeArray[0][0].equals("X") && toeArray[0][1].equals("X") && toeArray[0][2].equals("X")) {
        System.out.println("Player 1 wins!");
        return false;
      }
      if (toeArray[1][0].equals("X") && toeArray[1][1].equals("X") && toeArray[1][2].equals("X")) {
        System.out.println("Player 1 wins!");
        return false;
      }
      if (toeArray[2][0].equals("X") && toeArray[2][1].equals("X") && toeArray[2][2].equals("X")) {
        System.out.println("Player 1 wins!");
        return false;
      }
      if (toeArray[0][0].equals("X") && toeArray[1][0].equals("X") && toeArray[2][0].equals("X")) {
        System.out.println("Player 1 wins!");
        return false;
      }
      if (toeArray[0][1].equals("X") && toeArray[1][1].equals("X") && toeArray[2][1].equals("X")) {
        System.out.println("Player 1 wins!");
        return false;
      }
      if (toeArray[0][2].equals("X") && toeArray[1][2].equals("X") && toeArray[2][2].equals("X")) {
        System.out.println("Player 1 wins!");
        return false;
      }
      if (toeArray[0][0].equals("X") && toeArray[1][1].equals("X") && toeArray[2][2].equals("X")) {
        System.out.println("Player 1 wins!");
        return false;
      }
      if (toeArray[0][2].equals("X") && toeArray[1][1].equals("X") && toeArray[2][0].equals("X")) {
        System.out.println("Player 1 wins!");
        return false;
      }
      if (toeArray[0][0].equals("O") && toeArray[0][1].equals("O") && toeArray[0][2].equals("O")) {
        System.out.println("Player 2 wins!");
        return false;
      }
      if (toeArray[1][0].equals("O") && toeArray[1][1].equals("O") && toeArray[1][2].equals("O")) {
        System.out.println("Player 2 wins!");
        return false;
      }
      if (toeArray[2][0].equals("O") && toeArray[2][1].equals("O") && toeArray[2][2].equals("O")) {
        System.out.println("Player 2 wins!");
        return false;
      }
      if (toeArray[0][0].equals("O") && toeArray[1][0].equals("O") && toeArray[2][0].equals("O")) {
        System.out.println("Player 2 wins!");
        return false;
      }
      if (toeArray[0][1].equals("O") && toeArray[1][1].equals("O") && toeArray[2][1].equals("O")) {
        System.out.println("Player 2 wins!");
        return false;
      }
      if (toeArray[0][2].equals("O") && toeArray[1][2].equals("O") && toeArray[2][2].equals("O")) {
        System.out.println("Player 2 wins!");
        return false;
      }
      if (toeArray[0][0].equals("O") && toeArray[1][1].equals("O") && toeArray[2][2].equals("O")) {
        System.out.println("Player 2 wins!");
        return false;
      }
      if (toeArray[0][2].equals("O") && toeArray[1][1].equals("O") && toeArray[2][0].equals("O")) {
        System.out.println("Player 2 wins!");
        return false;
      }
    }
    int c;
    int d;
    boolean solutionFound = false;
    while (solutionFound == false) {
      c = (int)(Math.random() * 3);
      d = (int)(Math.random() * 3);
      if (toeArray[c][d].equals("-")) {
        if(player == 1) {
          toeArray[c][d] = "O";        
          }
        else {
          toeArray[c][d] = "X"; 
        }
        if (toeArray[0][0].equals("X") && toeArray[0][1].equals("X") && toeArray[0][2].equals("X")) {
          System.out.println("Player 1 wins!");
          return false;
        }
        if (toeArray[1][0].equals("X") && toeArray[1][1].equals("X") && toeArray[1][2].equals("X")) {
          System.out.println("Player 1 wins!");
          return false;
        }
        if (toeArray[2][0].equals("X") && toeArray[2][1].equals("X") && toeArray[2][2].equals("X")) {
          System.out.println("Player 1 wins!");
          return false;
        }
        if (toeArray[0][0].equals("X") && toeArray[1][0].equals("X") && toeArray[2][0].equals("X")) {
          System.out.println("Player 1 wins!");
          return false;
        }
        if (toeArray[0][1].equals("X") && toeArray[1][1].equals("X") && toeArray[2][1].equals("X")) {
          System.out.println("Player 1 wins!");
          return false;
        }
        if (toeArray[0][2].equals("X") && toeArray[1][2].equals("X") && toeArray[2][2].equals("X")) {
          System.out.println("Player 1 wins!");
          return false;
        }
        if (toeArray[0][0].equals("X") && toeArray[1][1].equals("X") && toeArray[2][2].equals("X")) {
          System.out.println("Player 1 wins!");
          return false;
        }
        if (toeArray[0][2].equals("X") && toeArray[1][1].equals("X") && toeArray[2][0].equals("X")) {
          System.out.println("Player 1 wins!");
          return false;
        }
        if (toeArray[0][0].equals("O") && toeArray[0][1].equals("O") && toeArray[0][2].equals("O")) {
          System.out.println("Player 2 wins!");
          return false;
        }
        if (toeArray[1][0].equals("O") && toeArray[1][1].equals("O") && toeArray[1][2].equals("O")) {
          System.out.println("Player 2 wins!");
          return false;
        }
        if (toeArray[2][0].equals("O") && toeArray[2][1].equals("O") && toeArray[2][2].equals("O")) {
          System.out.println("Player 2 wins!");
          return false;
        }
        if (toeArray[0][0].equals("O") && toeArray[1][0].equals("O") && toeArray[2][0].equals("O")) {
          System.out.println("Player 2 wins!");
          return false;
        }
        if (toeArray[0][1].equals("O") && toeArray[1][1].equals("O") && toeArray[2][1].equals("O")) {
          System.out.println("Player 2 wins!");
          return false;
        }
        if (toeArray[0][2].equals("O") && toeArray[1][2].equals("O") && toeArray[2][2].equals("O")) {
          System.out.println("Player 2 wins!");
          return false;
        }
        if (toeArray[0][0].equals("O") && toeArray[1][1].equals("O") && toeArray[2][2].equals("O")) {
          System.out.println("Player 2 wins!");
          return false;
        }
        if (toeArray[0][2].equals("O") && toeArray[1][1].equals("O") && toeArray[2][0].equals("O")) {
          System.out.println("Player 2 wins!");
          return false;
        }
        solutionFound = true;
      }
    }
  }
    catch(Exception e) {
      System.out.println("Input Other Coordinates.");
    }
    return true;
  }
  public static void toeDisplay(String[][] toeArray) {
    System.out.println(Arrays.toString(toeArray[0]));
    System.out.println(Arrays.toString(toeArray[1]));
    System.out.println(Arrays.toString(toeArray[2]));
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