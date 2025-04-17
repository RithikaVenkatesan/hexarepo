package com.bank.basics;
import java.util.Scanner;

public class PasswordValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Create bank account password: ");
        String password = scanner.nextLine();
        
        boolean Uppercase = false;
        boolean Digit = false;
        if (password.length() >= 8) {
        	for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    Uppercase = true;
                }
                if (Character.isDigit(ch)) {
                    Digit = true;
                }
            }
        	if (Uppercase && Digit) {
                System.out.println(" Password is valid");
            } else 
                System.out.println(" Password is not valid");
            }


        scanner.close();
        	
        	
        }
	}


