package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public class EletricEngine implements Engine {
	
	public EletricEngine() {
		System.out.println("EletricEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("EletricEngine:: Eletric Engine Started");

	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricEngine:: Eletric Engine stopped");

	}

}
