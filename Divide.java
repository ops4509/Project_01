package com.javalec.function;

public class Divide {

	int firstNum,secondNum;
	String result;
	
	public Divide() {
		
	}

	public Divide(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public String culc() {
		result = Integer.toString(firstNum)+" / "+Integer.toString(secondNum)+" = "+Integer.toString((firstNum/secondNum));
		
		return result;

	}
}
