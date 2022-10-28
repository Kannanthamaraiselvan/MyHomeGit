package com.home;

public class SumOfDigits {

	public static void main(String[] args) {
		int value = 1234;
		int sumOfDigits = 0;

		while (true) {
			int x = value % 10;
			value = value / 10;
			sumOfDigits = sumOfDigits + x;
			if (value == 0) {
				break;
			}
			
		}
		System.out.println(sumOfDigits);
	}

}
