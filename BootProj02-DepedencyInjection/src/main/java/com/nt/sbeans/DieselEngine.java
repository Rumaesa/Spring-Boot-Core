package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngg")
public class DieselEngine implements Engine {
	
	public DieselEngine() {
		System.out.println("DieselEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("DieselEngine:: Diesel Engine Started");

	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine:: Diesel Engine stopped");

	}

}
