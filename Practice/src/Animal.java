//Carlos Reyes
//This file contains the code for the Animal class that contains methods for other sub-animal classes
//This file is like a framework of methods and fields that can be utilized to have less repetitive code

//This is the class that is at the base of a tree of inheritance. It is like actual taxonomy, where Animal
//is an umbrella to a more specific class, like Bird, and Bird similarly is an umbrella for all Birds, like
//Penguin, in this example of inheritance.
public class Animal {
private String size;
private double heightInches;
private String sound;

public Animal(String size, double heightInches, String sound) {
  this.size = size;
  this.heightInches = heightInches;
  this.sound = sound;
}

protected void makeNoise() {
  System.out.println("I'm the " + this.getClass().getSimpleName() + ". My noise is " + sound);
}
}
