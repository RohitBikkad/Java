package com.data.main;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCarPoolingReq2 {
	
	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Member> memberList = new ArrayList<>();
		ArrayList<Car> carList = new ArrayList<>();
		ArrayList<MemberCar> memberCar = new ArrayList<>();
		
		while(true) {
			 System.out.println("Menu:");
	            System.out.println("1) Add a Member");
	            System.out.println("2) Add a Car");
	            System.out.println("3) Assign Car to Member (Assume valid data is supplied)");
	            System.out.println("4) Cars Owned");
	            System.out.println("5) Exit");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume the newline character

	            switch (choice) {
	                case 1:
	                	
	                	System.out.print("Member Id: ");
	                    Long memberId = scanner.nextLong();
	                    scanner.nextLine();
	                    System.out.print("first Name ");
	                    String firstName = scanner.nextLine();

	                    System.out.print("last name: ");
	                    String lastName = scanner.nextLine();

	                    System.out.print("email: ");
	                    String email = scanner.nextLine();

	                    System.out.print("contact number: ");
	                    String contactNumber = scanner.nextLine();

	                    System.out.print("license number: ");
	                    String licenseNumber = scanner.nextLine();

	                     Member newMember = new Member(memberId, firstName, lastName, email, contactNumber, licenseNumber);
	                     memberList.add(newMember);

	                     System.out.println("Member added successfully!");

	                	
	                	break;
	                case 2:
	                	
	                	 System.out.print("Car Id: ");
	                     Long carId = scanner.nextLong();
	                     scanner.nextLine(); 

	                     System.out.print("Car name: ");
	                     String name = scanner.nextLine();

	                     System.out.print("Car model: ");
	                     String model = scanner.nextLine();

	                     System.out.print("make year: ");
	                     int makeYear = scanner.nextInt();
	                     scanner.nextLine(); 

	                     System.out.print("company: ");
	                     String company = scanner.nextLine();

	                     System.out.print("comfort level: ");
	                     int comfortLevel = scanner.nextInt();
	                     scanner.nextLine(); 

	                     
	                     Car newCar = new Car(carId, name, model, makeYear, company, comfortLevel);
	                     carList.add(newCar);

	                     System.out.println("Car added successfully!");
	                    break;
	        
	                case 3:
	                	
	                	System.out.print("member car id: ");
	                     Long memberCarId = scanner.nextLong();
	                     scanner.nextLine(); 
	                     System.out.print("member id: ");
	                     Long memberIdForCar = scanner.nextLong();
	                     scanner.nextLine(); 
	                     
	                     System.out.print("car id: ");
	                     Long carIdForMember = scanner.nextLong();
	                     scanner.nextLine(); 

	                     System.out.print("car registration: ");
	                     String carRegistrationNumber = scanner.nextLine();

	                     System.out.print("color: ");
	                     String carColor = scanner.nextLine();

	                  
	                     Member memberForCar = Member.findMember(memberIdForCar, memberList);
	                     Car carForMember = Car.findCar(carList, carIdForMember);

	                     if (memberForCar != null && carForMember != null) {
	                        
	                         MemberCar newMemberCar = new MemberCar(memberCarId, memberForCar, carForMember, carRegistrationNumber, carColor);
	                         memberCar.add(newMemberCar);

	                         System.out.println("Car assigned to member successfully!");
	                     } else {
	                         System.out.println("Member or Car not found!");
	                     }
	                	break;
	                case 4:
	                	System.out.print("member id: ");
	                    Long memberIdForCarsOwned = scanner.nextLong();
	                    scanner.nextLine(); 
	                    
	                    Member memberForCarsOwned = Member.findMember(memberIdForCarsOwned, memberList);

	                    if (memberForCarsOwned != null) {
	                        System.out.println("Number of cars: " + memberForCarsOwned.getCarList().size());
	                        System.out.println("Registration Numbers:");
	                        for (MemberCar memberCars : memberForCarsOwned.getCarList()) {
	                            System.out.println(memberCars.getCarRegistrationNumber());
	                        }
	                    } else {
	                        System.out.println("Member not found!");
	                    }
	                    
	                     break;
	                case 5:
	                	System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
		
	            
	         
		
		
		
	}

}
}
