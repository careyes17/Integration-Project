/**
 * This file contains the code the MyComputer class, which implements the methods of Computer.
 * This document shows a developed class from the Computer interface, overriding all of the methods.
 * @author Carlos Reyes
 *
 */

public class MyComputer implements Computer {
  private String gpu;
  private int numberOfFans;
  private int gbOfRam;
  
  /**
   * Takes the specs from the initialization of a PC and stores those
   * values in the private fields in this class.
   * @param gpu The GPU a user decides to use.
   * @param numberOfFans The number of fans a user decides to use.
   * @param gbOfRam The number of GB of RAM a user decides to use.
   */
  
  public MyComputer(String gpu, int numberOfFans, int gbOfRam) {
    this.gpu = gpu;
    this.numberOfFans = numberOfFans;
    this.gbOfRam = gbOfRam;
  }
  //Overriding the method changeGPU that is in the interface computer 
  //that this class implements form
  
  @Override
  public void changeGpu(String newGpu) {
    gpu = newGpu;
  }

  @Override
  public void addFan(int numOfFans) {
    numberOfFans = numOfFans;
  }

  @Override
  public void upgradeRam(int newGbAmount) {
    gbOfRam = newGbAmount;
  }
  
  public void displaySpecs() {
    System.out.println("Type of GPU: " + gpu + "\nNumber of fans: "
        + numberOfFans + "\nGB's of RAM: " + gbOfRam);
  }

}
