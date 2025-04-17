package com.bank.basics;
import java.util.Scanner;

public class LoanEligible {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter credit score:");
		int creditScore=scanner.nextInt();

		System.out.println("enter annual income:");
		int annualIncome=scanner.nextInt();
		
		if(creditScore>700 && annualIncome>=50000) {
			System.out.println("eligible for loan");
		}else {
			System.out.println("not eligible");
		}
		
		scanner.close();
	
		
	}

}
