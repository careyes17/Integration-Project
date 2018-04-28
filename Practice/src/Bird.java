//Carlos Reyes
//This file contains the code for the Bird class, which inherits from Animal
//This class contains fields that are only specific to birds, which will allow
//bird objects to be created without omission of fields that not all animals have

public class Bird extends Animal {
  private double wingspan;

  public Bird(String size, double heightInches, String sound, double wingspan) {
    super(size, heightInches, sound);
    this.setWingspan(wingspan);
  }

  public double getWingspan() {
    return wingspan;
  }

  public void setWingspan(double wingspan) {
    this.wingspan = wingspan;
  }
}
