//Program to demonstrate method overloading
package com.tns.ifet.dayseven.overloading.overloading.v1;

public class Executor {

	public static void main(String[] args) {

		System.out.println("Is 121 Palindrome? "+Operations.isPalindrome(121));
		System.out.println("Is 123 Palindrome? "+Operations.isPalindrome(123));
		
		System.out.println("Is CAR Palindrome? "+Operations.isPalindrome("CAR"));
		System.out.println("Is RACECAR Palindrome? "+Operations.isPalindrome("RACECAR"));

	}

}
