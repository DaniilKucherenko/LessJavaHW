package ua.home.test1;

import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Введите число a");
		int a = sc1.nextInt();
		System.out.println("Введите число b");
		System.out.println();
		int b =sc1.nextInt();
	    int c =a*b;
	    for (int i = 2; i < c; i++) {
			if (c % i == 0) {
				System.out.println("Число " + c + " сложенное");
				return;
			}
		}
		System.out.println("Число " + c + " простое");
			
			
			
			
		}
		
	}


