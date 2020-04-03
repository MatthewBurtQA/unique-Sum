package com.qa.main;

public class sumChecker {
	
	public int checkSum(int a, int b, int c){
		int result = a + b + c;
		
		if(a != b && a != c && b != c){
			System.out.println("No duplication detected, calculating sum . . . " + result);
			return a+b+c;
			
		}else {
			System.out.println("Duplication detected. This ends the test. . . ");
		}
		return 0;
	}

}
