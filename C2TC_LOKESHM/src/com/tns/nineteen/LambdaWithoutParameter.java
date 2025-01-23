//Program to demonstrate Lambda expression without parameters
package com.tns.nineteen;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		
		IStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());


	}

}