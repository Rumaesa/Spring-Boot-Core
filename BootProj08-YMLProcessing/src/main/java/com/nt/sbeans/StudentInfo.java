package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("studInfo")
@Data
@ConfigurationProperties(prefix = "com.nt.stud")
public class StudentInfo {
	private Integer id;
	private String  name;
	private  String addrs;
	private  String[] nickNames;
	private  List<String> friends;
	private  Set<Long> phoneNumbers;
	private Map<String,Long> idDetails;
	private   College  college;
	

}
