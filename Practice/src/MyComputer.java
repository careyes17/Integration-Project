//Carlos Reyes
//This file contains the code the MyComputer class, which implements the methods of Computer
//This document shows a developed class from the Computer interface, overriding all of the methods

public class MyComputer implements Computer {
  private String GPU;
  private int NumberOfFans;
  private int GBOfRAM;
  
  public MyComputer(String GPU, int NumberOfFans, int GBOfRAM) {
    this.GPU = GPU;
    this.NumberOfFans = NumberOfFans;
    this.GBOfRAM = GBOfRAM;
  }
//Overriding the method changeGPU that is in the interface computer that this class implements form
  @Override
  public void changeGPU(String newGPU) {
    GPU = newGPU;
  }

  @Override
  public void addFan(int numOfFans) {
    NumberOfFans = numOfFans;
  }

  @Override
  public void upgradeRam(int newGBAmount) {
    GBOfRAM = newGBAmount;
  }
  
  public void displaySpecs() {
    System.out.println("Type of GPU: " + GPU + "\nNumber of fans: " + NumberOfFans + "\nGB's of RAM: " + GBOfRAM);
  }

}
