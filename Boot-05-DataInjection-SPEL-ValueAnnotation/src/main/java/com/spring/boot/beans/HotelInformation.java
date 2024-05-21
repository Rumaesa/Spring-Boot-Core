package com.spring.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hotelInfo")
@Data
public class HotelInformation {

	@Value("${hotel.name}")
	private String hotelName;
	@Value("1003")
	private int hotelId;
	@Value("${hotel.address}")
	private String hotelAddress;
	
	@Value("#{idly.price + medu.wada.price + manchurian.price}")
	private Float billAmount;

	@Override
	public String toString() {
		return "HotelInformation [hotelName=" + hotelName + ", hotelId=" + hotelId + ", hotelAddress=" + hotelAddress
				+ ", billAmount=" + billAmount + " ]";
	}
	
	
}
