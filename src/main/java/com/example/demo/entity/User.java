package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotBlank
	private Integer phoneId;
	@NotBlank
	@NotNull
	@Size(max = 30)
	private String firstName;
	@NotBlank
	@NotNull
	@Size(max = 30)
	private String lastName;
	@Range(min = 0)
	private Integer age;
	@NotBlank
	@NotNull
	@Size(max = 50)
	private String city;
	@NotBlank
	@NotNull
	private String pin;
	@NotBlank
	@NotNull
	@Size(max = 50)
	private String street;
    @NotNull
	@Pattern(regexp = "[0-9]+")
	@Size(max = 10)
	private Integer phoneNo1;
	@Pattern(regexp = "[0-9]+")
	@Size(max = 10)
	private Integer phoneNo2;
	@Pattern(regexp = "[0-9]+")
	@Size(max = 10)
	private Integer phoneNo3;

	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(Integer phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public Integer getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(Integer phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public Integer getPhoneNo3() {
		return phoneNo3;
	}

	public void setPhoneNo3(Integer phoneNo3) {
		this.phoneNo3 = phoneNo3;
	}

}
