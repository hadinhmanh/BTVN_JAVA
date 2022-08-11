package Bai2;

import java.util.Scanner;

public class Address {
	private static Scanner sc = new Scanner(System.in);
	private int id;
	private String district;
	private String province;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public void input() {
		System.out.print("nhập id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("nhập quận(huyện): ");
		district = sc.nextLine();
		System.out.print("nhập tỉnh: ");
		province = sc.nextLine();
	}
	
	
	public void output() {
		System.out.println("id là: "+id);
		System.out.println("Quận(huyện): "+district);
		System.out.println("Tỉnh: "+province);
	}
	
	public static void main(String[] args) {
		Address a = new Address();
		a.input();
		a.output();
	}
}
