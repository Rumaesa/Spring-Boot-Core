package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("PertrolEngine:: Petrol Engine Started");

	}

	@Override
	public void stopEngine() {
		System.out.println("PertrolEngine:: Petrol Engine stopped");

	}

}
