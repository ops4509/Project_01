package com.javalec.function;

public class ShareRest {
	private int firstNum;
	private int secondNum;
	private String result;
	public ShareRest(){
		
	}
	
	public ShareRest(int firstNum,int secondNum){
		this.firstNum=firstNum;
		this.secondNum=secondNum;
	}
	
	public String srCalc() {
		
		result = "몫 : "+(firstNum/secondNum)+"  나머지 : "+(firstNum%secondNum);
		return result;
	}
	
}
