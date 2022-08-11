package Bai1;

import java.util.Scanner;

public class May {
	private static Scanner sc = new Scanner(System.in);
	private String maMay;
	private String kieuMay;
	private String tinhTrang;
	
	
	public String getMaMay() {
		return maMay;
	}
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}
	public String getKieuMay() {
		return kieuMay;
	}
	public void setKieuMay(String kieuMay) {
		this.kieuMay = kieuMay;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
	public void input() {
		System.out.print("nhập mã máy: ");
		maMay = sc.nextLine();
		System.out.print("nhập kiểu máy: ");
		kieuMay = sc.nextLine();
		System.out.print("nhập tình trạng máy: ");
		tinhTrang = sc.nextLine();
	}
	
	
	public void output() {
		System.out.println("Mã máy: "+maMay);
		System.out.println("Kiểu máy: "+kieuMay);
		System.out.println("Tình trạng máy: "+tinhTrang);
	}
	
	public static void main(String[] args) {
		May may = new May();
		may.input();
		may.output();
	}
	
}
