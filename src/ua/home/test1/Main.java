package ua.home.test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a");
		System.out.println();

		int a = sc.nextInt();

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.println("Число " + a + " сложенное");
				return;
			}
		}
		System.out.println("Число " + a + " простое");
	}

}