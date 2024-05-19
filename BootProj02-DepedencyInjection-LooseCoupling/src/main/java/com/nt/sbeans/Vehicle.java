
//target class
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
@Qualifier("motor")
		private Engine  engg;
	
	//@Qualifier("pEngg")  //---> Dependent Bean id is hardcoded , so not recomanded
	//@Qualifier("${engine.id}")  //---> place holder is allowed only inside the @Value 
	//@Qualifier("@Value('${engine.id}')") //--->  @Value is used as the indepndent annotation i.e  it can not be used inside @Qualifier(-) annotation
	
	/*@Value("${engine.id}")  // injecting the dependent springbean id to  String property
	private  String id;
	@Qualifier(id)   // --> variables can not passed to the @Qualifier annotation
   private Engine  engg;*/
	
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
