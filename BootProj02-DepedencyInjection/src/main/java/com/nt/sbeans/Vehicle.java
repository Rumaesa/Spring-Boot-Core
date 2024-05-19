
//target class
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("pEngg")
   private Engine  engg;
	
	public Vehicle() {
		System.out.println("Vehicle: 0-param constructor");
	}
	
	   //b.method
	public   void   journey(String sourcePlace ,String destPlace) {
		System.out.println("Vehicle.journey():: Journey started from ::"+sourcePlace);
		engg.startEngine();
		
		System.out.println("Vehicle.jouney():: Journey is going on...");
		
		engg.stopEngine();
		System.out.println("Vehicle.journey():: Journey stopped at ::"+destPlace);
		
	}
}
