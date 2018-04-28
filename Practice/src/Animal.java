//Carlos Reyes
//This file contains the code for the Animal class that contains methods 
//for other sub-animal classes
//This file is like a framework of methods and fields that can be 
//utilized to have less repetitive code

//This is the class that is at the base of a tree of inheritance. 
//It is like actual taxonomy, where Animal
//is an umbrella to a more specific class, like Bird, and Bird 
//similarly is an umbrella for all Birds, like
//Penguin, in this example of inheritance.
public class Animal {
  private String size;
  private double heightInches;
  private String sound;

  /**
   * Takes input values from initializations and stores these values
   * in private fields inside this class.
   * @param size The size of an animal.
   * @param heightInches The height of an animal expressed in inches.
   * @param sound The sound an animal makes.
   */
  
  public Animal(String size, double heightInches, String sound) {
    this.size = size;
    this.heightInches = heightInches;
    this.sound = sound;
  }

  protected void changeHeight(double heightInches) {
    this.heightInches = heightInches;
  }

  protected void changeSize(String size) {
    this.size = size;
  }

  protected double getHeight() {
    return heightInches; 
  }

  protected String getSize() {
    return size;
  }

  protected void makeNoise() {
    System.out.println("I'm the " + this.getClass().getSimpleName() + ". My noise is " + sound);
  }
}
