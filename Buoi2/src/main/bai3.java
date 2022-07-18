package main;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập n: ");
		int n = scanner.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.print("Tổng các ước của "+n+" là:"+sum);
	}

}
