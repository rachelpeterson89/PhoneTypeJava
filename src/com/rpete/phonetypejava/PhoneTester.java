package com.rpete.phonetypejava;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s20 = new Galaxy("S11", 99, "T-Mobile", "Ring Ring Ring!");
		IPhone iphone12 = new IPhone("12", 100, "AT&T", "Zing");
		
		s20.displayInfo();
		System.out.println(s20.ring());
		System.out.println(s20.unlock());
		
		iphone12.displayInfo();
		System.out.println(iphone12.ring());
		System.out.println(iphone12.unlock());
	}
}
