package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num01 = 0, num02 = 0;
		String clac;
		boolean exit = true;
		try {
			while (exit) {

				System.out.print(">>");
				String a = sc.nextLine();
				String sArray[] = a.split(" ");

				if (sArray.length == 1) {
					clac = sArray[0];
				} else {
					num01 = Integer.parseInt(sArray[0]);
					clac = sArray[1];
					num02 = Integer.parseInt(sArray[2]);
				}

				switch (clac) {
				case "+":
					Add add = new Add();
					add.setValue(num01, num02);
					System.out.println(add.calculate());
					break;

				case "-":
					Sub sub = new Sub();
					sub.setValue(num01, num02);
					System.out.println(sub.calculate());
					break;

				case "/":
					Div div = new Div();
					div.setValue(num01, num02);
					System.out.println(div.calculate());
					break;

				case "*":
					Mul mul = new Mul();
					mul.setValue(num01, num02);
					System.out.println(mul.calculate());
					break;

				case "/q":
					System.out.println("종료합니다.");
					exit = false;
					break;

				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
				}
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}
}
