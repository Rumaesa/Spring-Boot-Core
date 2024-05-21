package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("empInfo")
@Data
@ConfigurationProperties(prefix = "org.nit")
public class EmployeeInfo {
	private Integer id;
	private String  name;
	private  String addrs;
	private Long phone;

}
