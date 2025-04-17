package com.bank.basics;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no of customers: ");
        int noOfCustomers = scanner.nextInt();
        for (int i = 1; i <= noOfCustomers; i++) {
            System.out.println("Customer " + i + ":");
            
            System.out.println("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            System.out.println("Enter annual interest rate (%): ");
            double interestRate = scanner.nextDouble();
            System.out.println("Enter no of years: ");
            int years = scanner.nextInt();
            double futureBalance = initialBalance * Math.pow((1 + interestRate / 100), years);
            System.out.println("Future balance :",  futureBalance);
            
        
        }
	}

}
