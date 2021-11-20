package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	@Id
	private String mobileNo;
	
	
	
	

}
