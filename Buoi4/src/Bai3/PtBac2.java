package Bai3;

import java.util.Scanner;

public class PtBac2 {
	private static Scanner sc = new Scanner(System.in);
	private static int a;
	private static int b;
	private static int c;

	public void input() {
		System.out.print("Nhập a, b ,c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	}
	
	public void tinh(int a, int b, int c) {
		float x1,x2;
		if(a==0) {
			x1=-c/b;
			System.out.println("Nghiệm của phương trình là: "+x1);
		}else {
			float delta = b*b - 4*a*c;
			if(delta<0) {
				System.out.println("Phương trình vô nghiệm");
			}
			else if(delta == 0) {
				x1=x2=-b/(2*a);
				System.out.println("Phương trình có nghiệm kép x1=x2="+x1);
			}else {
				x1= (float) (-b+Math.sqrt(delta))/(2*a);
				x2= (float) (-b-Math.sqrt(delta))/(2*a);
				System.out.println("Phương trình có 2 nghiệm phân biệt là: x1="+x1+" x2="+x2);
			}
		} 
	}
	
	public static void main(String[] args) {
		PtBac2 PtBac2a = new PtBac2();
		PtBac2a.input(); 
		PtBac2a.tinh(a,b,c);
	}
}
