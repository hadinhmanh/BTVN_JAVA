package main;
import java.util.Locale;
import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a ="   22    hà    đìn22h   mạnh     ";
		 a =a.trim().toLowerCase();
		 a = a.replaceAll("\\s+"," ");
		a = a.replaceAll("[0-9]","");
		String d[] = a.split(" ");
		a="";
		for (int i = 0; i < d.length; i++) {
			if (d[i].length() != 0) {
				a += d[i].substring(0, 1).toUpperCase() + d[i].substring(1) + " ";//viết hoa chữ cái đầu tiên
			}
		}
		System.out.println("chuỗi sau khi chuẩn hóa là:"+a);
		
	}
}