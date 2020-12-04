package com.rpete.phonetypejava;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    //implementing ring
    @Override
    public String ring() {
    	String phoneRings = "iPhone " + getVersionNumber() + " says " + getRingTone();
    	return phoneRings;
    }
    
    //implementing unlock
    @Override
    public String unlock() {
    	String unlockMsg = "Unlocking via facial recognition";
        return unlockMsg;
    }
  
    @Override
    public void displayInfo() {
    	System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());          
    }
}