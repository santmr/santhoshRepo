package com.shoppingcart.application.userdetailsentity;

import java.time.Instant;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Userdetails {

	public Userdetails(int sNo2, long phoneno, String userName2, String gender2, String emaidId2, Instant date2,
			UserAddress useraddress2) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int sNo;
	
	//@Id
	private long phoneNumber;
	
	private String userName;
	
	private String gender;
	
	//@Id
	private String emaidId;
	
	@DateTimeFormat
	private Date date;

	@OneToOne(cascade = CascadeType.ALL)
	private UserAddress useraddress;
	
}
