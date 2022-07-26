package main;

import java.util.Scanner;
//import java.lang.Math;
public class bai1 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void nhap(int a[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = sc.nextInt();
		}
	}
	
	public static void xuat(int a[]) {
		for(int item: a) {
			System.out.print(item+" ");
		}
	}
	
	public static double tinh(int a[], int n) {
		int sum=0,count=0;
		for(int i=0; i<n; i++) {
			if(a[i]%2 == 1 && (i+1)%2==0) {
				sum+=a[i];
				count++;
			}
		}
		double tbc=sum/count;
		System.out.println();
		return tbc;
	}
	
	public static void tim(int a[], int n) {
		int min=a[0];
		for(int i=1; i<n; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.print("Vị trí các số nhỏ nhất là: ");
		for(int i=0; i<n; i++) {
			if(a[i]==min) {
				System.out.print(i+1+" ");
			}
		}
	}
	
	public static void kTra(int a[], int n) {
		int count=0;
		System.out.println();
		System.out.print("Số chính phương trong mảng là: ");
		for(int i=0; i<n; i++) {
			int j= (int) Math.sqrt(a[i]);
			if(j*j == a[i]) {
				System.out.print(a[i]+" ");
				count++;
			}
		}
		if(count==0) {
			System.out.print("không có số chính phương");
		}
	}

	public static int ktraSoNguyenTo(int k) {
		if(k<2) {
			return 0;
		}else {
			for(int i=2; i<= (int) Math.sqrt(k); i++) {
				if(k%i==0) {
					return 0;
				}
			}
		}
		return 1;
	}
	
	public static void soNguyenTo(int a[], int n) {
		int count=0;
		System.out.println();
		System.out.print("Các số nguyên tố trong mảng là: ");
		for(int i=0; i<n; i++) {
			if(ktraSoNguyenTo(a[i])==1) {
				System.out.print(a[i]+" ");
				count++;
			}
		}
		if(count==0) {
			System.out.println("không có");
		}
	}
	
	public static void sapXep(int a[], int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Mảng sau khi sắp xếp là: ");
	}
	public static void main(String[] args) {

		System.out.print("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		nhap(a,n);
		xuat(a);
		System.out.println("Trung bình cộng số lẻ ở vị trí chẵn là: "+tinh(a,n));
		tim(a,n);
		kTra(a,n);
		soNguyenTo(a,n);
		sapXep(a,n);
		xuat(a);
	}
	
}
