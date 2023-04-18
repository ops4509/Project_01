package com.javalec.function;

public class SumSubtract {

	public SumSubtract() {
		// TODO Auto-generated constructor stub
	}
	
	private int firstNum = 0;
	private int secondNum = 0;
	private int result;
	
	public SumSubtract(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public int sumCale() {
		int result = firstNum + secondNum; 
		return result;
	}
	
	
	public int subtract() {
		int result = firstNum - secondNum; 
		return result;
	}
	
	
}
