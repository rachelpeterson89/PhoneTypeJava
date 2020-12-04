package com.rpete.phonetypejava;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    //implementing ring
    @Override
    public String ring() {
    	String phoneRings = "Galaxy " + getVersionNumber() + " says " + getRingTone();
    	return phoneRings;
    }
    
    //implementing unlock
    @Override
    public String unlock() {
    	String unlockMsg = "Unlocking via finger print";
        return unlockMsg;
    }
  
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());          
    }
}
