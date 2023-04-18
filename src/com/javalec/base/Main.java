package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Divide;
import com.javalec.function.Multiple;
import com.javalec.function.ShareRest;
import com.javalec.function.SumSubtract;

public class Main {

	public static void main(String[] args) {

		int firstNum, secondNum, menuNum = 0;
		String result;
		Scanner scanner = new Scanner(System.in);

		while (menuNum != 6) {
			System.out.print("첫번째 숫자를 입력하세요. : ");
			firstNum = scanner.nextInt();
			System.out.print("두번째 숫자를 입력하세요. : ");
			secondNum = scanner.nextInt();

			System.out.println("*** 원하는 결과를 선택하세요 ***");
			System.out.print("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 몫과 나머지\n6. 종료\n");
			System.out.print("======> 선택 : ");
			menuNum = scanner.nextInt();
			SumSubtract sumSubtract = new SumSubtract(firstNum, secondNum);
			Multiple multiple = new Multiple(firstNum, secondNum);
			Divide divide = new Divide(firstNum, secondNum);
			ShareRest shareRest = new ShareRest(firstNum, secondNum);

			switch (menuNum) {
			case 1:
				result = Integer.toString(sumSubtract.sumCale());
				System.out.println(firstNum + " + " + secondNum + " = " + result);
				break;
			case 2:
				result = Integer.toString(sumSubtract.subtract());
				System.out.println(firstNum + " - " + secondNum + " = " + result);
				break;
			case 3:
				System.out.println(multiple.calc());
				break;
			case 4:
				System.out.println(divide.calc());
				break;
			case 5:
				System.out.println(shareRest.srCalc());
				break;
			case 6:
				System.out.println("종료!");
				break;
			default:
				System.out.println("올바른 값을 입력하세요.");
			}
			System.out.println("-------------");
		}
	}

}
