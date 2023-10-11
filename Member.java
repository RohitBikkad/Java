package com.data.main;

import java.util.ArrayList;

public class Member {
	
	private Long id;
	private String name;
	private String email;
	private String contact;
	private String license;
	private ArrayList<MemberCar> carList =new ArrayList<>();
	
	public Member() {
		super();
		
	}

	public Member(Long id, String name, String email, String contact, String license, ArrayList<MemberCar> carList) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.license = license;
		this.carList = carList;
	}
	
	public Member(Long memberId, String firstName, String lastName, String email2, String contactNumber,
			String licenseNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.license = license;
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public ArrayList<MemberCar> getCarList() {
		return carList;
	}

	public void setCarList(ArrayList<MemberCar> carList) {
		this.carList = carList;
	}

	
	public static Member findMember(Long memberIdForCarsOwned, ArrayList<Member> members) {
	    for (Member member : members) {
	        if (member.getId().equals(memberIdForCarsOwned)) {
	            return member;
	        }
	    }
	    return null;
	}

	
	public void displayCarsOwned() {
        System.out.println("Number of cars: " + carList.size());
        System.out.println("Registration Numbers:");

        for (MemberCar memberCar : carList) {
            System.out.println(memberCar.getCarRegistrationNumber());
        }
    }

}
