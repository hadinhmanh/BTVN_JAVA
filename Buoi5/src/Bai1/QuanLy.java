package Bai1;

import java.util.Scanner;

public class QuanLy {
	private static Scanner sc = new Scanner(System.in);
	private String maQL;
	private String hoTen;
	
	
	public String getMaQL() {
		return maQL;
	}
	public void setMaQL(String maQL) {
		this.maQL = maQL;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void input() {
		System.out.print("Nhập mã quản lý: ");
		maQL = sc.nextLine();
		System.out.print("Nhập họ tên quản lý: ");
		hoTen = sc.nextLine();
	}
	
	public void output() {
		System.out.println("Mã quản lý là: "+maQL);
		System.out.println("Tên quản lý là: "+hoTen);
	}
	
	public static void main(String[] args) {
		QuanLy a = new QuanLy();
		a.input();
		a.output();
	}
}
