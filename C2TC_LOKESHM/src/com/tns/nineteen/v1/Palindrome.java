//Program to define generic functional interface Palindrome

package com.tns.nineteen.v1;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
