package com.lect.ex06_wrapper;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		String inputNo= sc.next();
		int no = Integer.parseInt(inputNo);
		System.out.println("�Է��Ͻ� ���� : "+(no+1));
		sc.close();
	}
}