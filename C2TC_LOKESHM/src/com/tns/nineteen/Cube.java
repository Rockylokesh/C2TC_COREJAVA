//Program to demonstrate Functional Interface

package com.tns.nineteen;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}