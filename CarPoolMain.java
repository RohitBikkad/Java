package com.demo.main;
import com.demo.model.Member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class CarPoolMain {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Member1 :");
        Member member1 = getMemberDetails(scanner);

        System.out.println("Member2 :");
        Member member2 = getMemberDetails(scanner);

        System.out.println("\nMember 1 \nName: " + member1.getFirstName() + " , " + member1.getLastName());
        System.out.println("Member contact details: " + member1.getContactNumber() + " , " + member1.getEmail());

        System.out.println("\nMember 2 \nName: " + member2.getFirstName() + " , " + member2.getLastName());
        System.out.println("Member contact details: " + member2.getContactNumber() + " , " + member2.getEmail());

        if (member1.equals(member2)) {
            System.out.println("\nMember 1 is same as Member 2");
        } else {
            System.out.println("\nMember 1 and Member 2 are different");
        }


    }

    private static Member getMemberDetails(Scanner scanner) {
        System.out.print("id: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("first name: ");
        String firstName = scanner.nextLine();

        System.out.print("last name: ");
        String lastName = scanner.nextLine();

        System.out.print("email: ");
        String email = scanner.nextLine();

        System.out.print("contact number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("license number: ");
        String licenseNumber = scanner.nextLine();

        System.out.print("license start date (dd-MM-yyyy): ");
        String licenseStartDate = scanner.nextLine();

        System.out.print("license expiry date (dd-MM-yyyy): ");
        String licenseExpiryDate = scanner.nextLine();
        
        try {
            Date startDate = new SimpleDateFormat("dd-MM-yyyy").parse(licenseStartDate);
            Date expiryDate = new SimpleDateFormat("dd-MM-yyyy").parse(licenseExpiryDate);

            return new Member(id, firstName, lastName, email, contactNumber, licenseNumber, startDate, expiryDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        
        
    }
}
