package com.hyeree.OSHW;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {

		System.out.print("input the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1 && n <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(n + "*" + i + "=" + (n * i));
			}
		} else if (n == 0) {
			int j = 2;
			while (j <= 9) {
				System.out.println("****" + j + "dan" + "****");
				for (int i = 1; i <= 9; i++) {

					System.out.println(j + "*" + i + "=" + (j * i));
				}
				j++;
			}
		}
	}

}
