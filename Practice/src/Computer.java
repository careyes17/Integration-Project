//Carlos Reyes
//This file contains the code for an interface called Computer, which holds a blueprint for
//sub-computer classes
//This document shows the framework methods that each sub-computer class must adopt

public interface Computer {
  void changeGpu(String newGpu);

  void addFan(int numOfFans);

  void upgradeRam(int newGbAmount);

  void displaySpecs();
}
