/**
 * This file contains the code for the Penguin class, which inherits 
 * from Animal and Bird. With this class, you are able to instantiate a 
 * Penguin object and input all of its characteristics.
 * @author Carlos Reyes
 *
 */

public class Penguin extends Bird {

  public Penguin(String size, double heightInches, String sound, double wingspan) {
    super(size, heightInches, sound, wingspan);
    makeNoise();
  }

}
