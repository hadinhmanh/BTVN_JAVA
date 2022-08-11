package Bai1;

import java.util.Scanner;

public class PhongMay {
	private static Scanner sc = new Scanner(System.in);
	private String maPhong;
	private String tenPhong;
	private int dienTich;
	private QuanLy x = new QuanLy();
	private May y = new May();
	
	public String getMaPhong() {
		return maPhong;
	}
	
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	
	public String getTenPhong() {
		return tenPhong;
	}
	
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	
	public int getDienTich() {
		return dienTich;
	}
	public void setDienTich(int dienTich) {
		this.dienTich = dienTich;
	}
	public QuanLy getX() {
		return x;
	}
	public void setX(QuanLy x) {
		this.x = x;
	}
	public May getY() {
		return y;
	}
	public void setY(May y) {
		this.y = y;
	}
	
	public void input() {
		System.out.print("nhập mã phòng: ");
		maPhong = sc.nextLine();
		System.out.print("nhập tên phòng:");
		tenPhong = sc.nextLine();
		System.out.print("nhập diện tích phòng: ");
		dienTich = sc.nextInt();
		x.input();
		y.input();
	}
	
	public void output() {
		System.out.println("mã phòng là: "+maPhong);
		System.out.println("tên phòng là: "+tenPhong);
		System.out.println("mã phòng là: "+dienTich);
		x.output();
		y.output();
	}
	
	
	public static void main(String[] args) {
		PhongMay a = new PhongMay();
		a.input();
		a.output();
	}
}
