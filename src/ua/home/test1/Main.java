package ua.home.test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Введите число a");
		System.out.println();
		double a=sc.nextInt();
		
		double b =a;
		
		if(a%b==0&&a%1==0) {
			System.out.println("Число a простое");
			
		
		}else {
			System.out.println("Число a сложенное");
		}

	}

}
