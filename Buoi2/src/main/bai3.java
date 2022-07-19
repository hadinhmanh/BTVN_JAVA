package main;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("nhập n: ");
			 n = scanner.nextInt();
		}while(n<=0);
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.print("Tổng các ước của "+n+" là:"+sum);
	}

}
