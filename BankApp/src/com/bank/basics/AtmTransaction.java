package com.bank.basics;
import java.util.Scanner;

public class AtmTransaction {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your balance:");
		double balance=scanner.nextDouble();
		
		System.out.println("1. check balance");
		System.out.println("2. withdraw");
		System.out.println("3. Deposit");
		System.out.println("choose option");
		int option=scanner.nextInt();
		
		if(option==1) {
			System.out.println("balance :"+balance);
		} else if (option==2) {
			System.out.println("withdraw amount:");
			double withdrawalAmount =scanner.nextDouble();
			
			 if (withdrawalAmount % 100 == 0 || withdrawalAmount % 500 == 0) {
				 System.out.println("withdrawal successful");
			 } else {
				 System.out.println("not successful");
			 }
		} else if (option==3) {
			System.out.println("deposit amount:");
			double depositAmount =scanner.nextDouble();
			
		}
		
		
		
	}

}
