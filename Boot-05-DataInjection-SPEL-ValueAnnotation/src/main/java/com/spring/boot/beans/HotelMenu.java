package com.spring.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hotelMenu")
@Data
public class HotelMenu {

	@Value("${idly.price}")
	private int idlyPrice;
	@Value("${dosa.price}")
	private int dosaPrice;
	@Value("${pau.bhaji.price}")
	private int pauBhajiPrice;
	@Value("${medu.wada.price}")
	private int meduWadaPrice;
	@Value("${wada.pau.price}")
	private int wadaPauPrice;
	@Value("${manchurian.price}")
	private int manchurianPrice;
	
	
	@Override
	public String toString() {
		return "HotelMenu [idlyPrice=" + idlyPrice + ", dosaPrice=" + dosaPrice + ", pauBhajiPrice=" + pauBhajiPrice
				+ ", meduWadaPrice=" + meduWadaPrice + ", wadaPauPrice=" + wadaPauPrice + ", manchurianPrice="
				+ manchurianPrice + "]";
	}
	
	

	
	
}
