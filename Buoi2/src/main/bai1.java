package main;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ngay,thang,nam;
		System.out.print("nhập ngày:");
		ngay = scanner.nextInt();
		System.out.print("nhập tháng: ");
		thang = scanner.nextInt();
		System.out.print("nhập năm: ");
		nam = scanner.nextInt();
		switch(thang) {
		case 1: {
			if(ngay >= 1 && ngay <= 19) {
				System.out.print("Ma Kết");
			}else {
				System.out.print("Bảo Bình");
			}
			break;
		}
		case 2: {
			if(ngay >= 1 && ngay <= 18) {
				System.out.print("Bảo Bình");
			}else {
				System.out.print("Song ngư");
			}
			break;
		}
		case 3: {
			if(ngay >= 1 && ngay <= 20) {
				System.out.print("Song ngư");
			}else {
				System.out.print("Bạch Dương");
			}
			break;
		}
		case 4: {
			if(ngay >= 1 && ngay <= 20) {
				System.out.print("Bạch Dương");
			}else {
				System.out.print("Kim Ngưu");
			}
			break;
		}
		case 5: {
			if(ngay >= 1 && ngay <= 20) {
				System.out.print("Kim Ngưu");
			}else {
				System.out.print("Song Tử");
			}
			break;
		}
		case 6: {
			if(ngay >= 1 && ngay <= 21) {
				System.out.print("Song Tử");
			}else {
				System.out.print("Cựu Giải");
			}
			break;
		}
		case 7: {
			if(ngay >= 1 && ngay <= 22) {
				System.out.print("Cựu Giải");
			}else {
				System.out.print("Sư Tử");
			}
			break;
		}
		case 8: {
			if(ngay >= 1 && ngay <= 22) {
				System.out.print("Sử Tử");
			}else {
				System.out.print("Cựu Giải");
			}
			break;
		}
		case 9: {
			if(ngay >= 1 && ngay <= 21) {
				System.out.print("Song Tử");
			}else {
				System.out.print("Xử Nữ");
			}
			break;
		}
		case 10: {
			if(ngay >= 1 && ngay <= 23) {
				System.out.print("Thiên Bình");
			}else {
				System.out.print("Bọ Cạp");
			}
			break;
		}
		case 11: {
			if(ngay >= 1 && ngay <= 22) {
				System.out.print("Bọ Cạp");
			}else {
				System.out.print("Nhân Mã");
			}
			break;
		}
		case 12: {
			if(ngay >= 1 && ngay <= 21) {
				System.out.print("Nhân Mã");
			}else {
				System.out.print("Ma Kết");
			}
			break;
		}
		}
	}
}
