//CompanyInfo.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("company")
@ConfigurationProperties(prefix = "org.nt")
@Setter
public class CompanyInfo {
	private String name;
	private  String addrs;
	private  Long  pin;
	private  Long contactno;
	@Value("${nit.size1}")
	private   Integer size;
	@Value("${org.nt.md}")
	private  String owner;
	
	
	//toString()
	@Override
	public String toString() {
		return "CompanyInfo [name=" + name + ", addrs=" + addrs + ", pin=" + pin + ", contactno=" + contactno
				+ ", size=" + size + " owner="+owner+"]";
	}
	

}
