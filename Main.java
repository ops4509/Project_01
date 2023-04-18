package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Divide;
import com.javalec.function.Multiple;

public class Main {

	public static void main(String[] args) {

		int firstNum, secondNum, menuNum;
		String result;
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요. : ");
		firstNum = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요. : ");
		secondNum = scanner.nextInt();

		System.out.println("*** 원하는 결과를 선택하세요 ***");
		System.out.print("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 몫과 나머지\n6. 종료\n");
		System.out.print("======> 선택 : ");
		menuNum = scanner.nextInt();

		switch (menuNum) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			Multiple multiple = new Multiple(firstNum,secondNum);
			System.out.println(multiple.culc());
			break;
		case 4:
			Divide divide = new Divide(firstNum,secondNum);
			System.out.println(divide.culc());
			break;
		case 5:
			break;
		case 6:
			break;
		default:
			System.out.println("올바른 값을 입력하세요.");
		}

	}

}
