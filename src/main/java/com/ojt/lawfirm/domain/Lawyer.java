package com.ojt.lawfirm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Lawyer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Integer noOfCase;
	private Integer noOfSuccessCase;
	private Integer noOfFailCase;
	private String address;
	private Double cost;
	private String nrc;
	private String phoneNo;
	private String photo;
	private Boolean status;
	private String certificate;
	private String accountName;

}
