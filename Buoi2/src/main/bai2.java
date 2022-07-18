package main;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.print("nhập 3 cạnh: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			System.out.println("3 cạnh tạo thành tam giác");
			if((a*a + b*b)==c*c || (a*a + c*c)==b*b || (b*b + c*c)==a*a) {
				System.out.println("Thuộc loại tam giác vuông");
			}else if((a*a + b*b)==c*c && a==b || (a*a + c*c)==b*b && a==c || (b*b + c*c)==a*a && b==c){
				System.out.println("Là tam giác vuông cân");
			}else if(a==b && b==c) {
				System.out.println("Là tam giác đều");
			}else {
				System.out.println("Là tam giác thường");
			}
		}else {
			System.out.println("Không thể tạo thành tam giác");
		}
	}

}
