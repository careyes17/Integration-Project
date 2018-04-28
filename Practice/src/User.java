/**
 * This file contains the code for User objects, or players of the inquisitive quiz game.
 * This will detail certain important details about the player's performance, etc.
 * @author Carlos Reyes
 *
 */

public class User {
  // These will be used later in development
  private String difficultySelection = new String();
  private int age;
  private static int numberOfUsers = 0;
  
  /**
   * Takes the input values describing a user to be stored in the private
   * fields in this class in initialization.
   * @param age The age of the user.
   * @param difficulty The difficulty the user chooses.
   */
  
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
