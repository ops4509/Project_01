package com.javalec.function;

public class Multiple {

	int firstNum,secondNum;
	String result;
	
	public Multiple() {
		
	}

	public Multiple(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public String culc() {
		result = Integer.toString(firstNum)+" X "+Integer.toString(secondNum)+" = "+Integer.toString((firstNum*secondNum));
		
		return result;

	}
}
