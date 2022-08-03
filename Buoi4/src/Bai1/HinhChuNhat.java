package Bai1;

import java.util.Scanner;

public class HinhChuNhat {
	private int chieuDai;
	private int chieuRong;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập chiều dài: ");
		chieuDai = sc.nextInt();
		System.out.print("nhập chiều rộng: ");
		chieuRong = sc.nextInt();
	}
	
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public void output() {
//		System.out.printf("%-10s%-10s%-10s\n" , "Chiều dài" , "Chiều rộng" , "Chu vi", "Diện tích");
        System.out.printf("%-15d%-15d%-15d%-15d\n" , chieuDai , chieuRong, chuVi(chieuDai, chieuRong), dienTich(chieuDai,chieuRong) );
	}
	
	public static int chuVi(int a, int b) {
		int chuVi = (a+b)*2;
		return chuVi;
	}
	
	public static int dienTich(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		HinhChuNhat HinhChuNhata = new HinhChuNhat();
		HinhChuNhat HinhChuNhatb = new HinhChuNhat();
		
//		Nhập cách 1:
		System.out.println("Hình chữ nhật a");
		HinhChuNhata.input();
		System.out.println("Hình chữ nhật b");
		HinhChuNhatb.input();
//		Nhập cách 2:
//		HinhChuNhata.setChieuDai(sc.nextInt());
//		HinhChuNhata.setChieuRong(sc.nextInt());
//		System.out.println("CHiều dài hình chữ nhật là: "+HinhChuNhata.getChieuDai());
//		System.out.println("CHiều rộng hình chữ nhật là: "+HinhChuNhata.getChieuRong());
		
		System.out.printf("%-15s%-15s%-15s%-15s\n","Chiều dài","Chiều rộng","Chu vi","Diện tích");
		HinhChuNhata.output();
		HinhChuNhatb.output();
		int s1 = HinhChuNhata.dienTich(HinhChuNhata.chieuDai, HinhChuNhata.chieuRong);
		int s2 = HinhChuNhatb.dienTich(HinhChuNhatb.chieuDai, HinhChuNhatb.chieuRong);
		if(s1>s2) {
			System.out.println("Diện tích hình chữ nhật a lớn hơn b");
		}else if(s1==s2) {
			System.out.println("Diện tích hình chữ nhật a bằng b");
		}else {
			System.out.println("Diện tích hình chữ nhật a nhỏ hơn b");
		}
	}

}
