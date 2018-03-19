//Carlos Reyes
//This file contains the code for User objects, or players of the inquisitive quiz game
//This will detail certain important details about the player's performance, etc.

public class User {
	// These will be used later in development
	private String difficultySelection = new String();
	private int age;
	private static int numberOfUsers = 0;
	
	public User(int age, String difficulty) {
	  this.age = age;
	  this.difficultySelection = difficulty;
	  numberOfUsers += 1;
	}
	
	public User(String difficulty) {
    this.difficultySelection = difficulty;
    numberOfUsers += 1;
  }
	
	public User(int age) {
    this.age = age;
    numberOfUsers += 1;
  }

	public String getDifficultySelection() {
		return this.difficultySelection;
	}

	public void setDifficultySelection(String difficultySelection) {
		this.difficultySelection = difficultySelection;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

  public static int getNumberOfUsers() {
    return numberOfUsers;
  }

}
