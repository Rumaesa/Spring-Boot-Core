package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cngEngg")
public class CNGEngine implements Engine {
	
	public CNGEngine() {
		System.out.println("CNGEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("CNGEngine:: CNG Engine Started");

	}

	@Override
	public void stopEngine() {
		System.out.println("CNGEngine:: CNG Engine stopped");

	}

}
